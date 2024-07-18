package irvine.math.nauty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.Graph6;
import irvine.math.z.Z;
import irvine.util.CliFlags;
import irvine.util.array.Sort;

/**
 * Vertex colouring.
 * @author Brendan McKay
 * @author Sean A. Irvine (Java port)
 */
public class VertexColour {

  // Based on vcolg.c version 3.1; B D McKay, Apr 24, 2021

  // Original help:

  // vcolg [-q] [-u|-T|-o] [-e#|-e#:#] [-m#] [-c#,..,#] [-f#] [infile [outfile]]

  //   Read graphs or digraphs and colour their vertices
  //   in all possible ways with colours 0,1,2,... .
  //   Isomorphic graphs derived from the same input are suppressed.
  //   If the input graphs are non-isomorphic then the output graphs are also.
  //
  //     -e# | -e#:#  specify a value or range of the total value of the colours
  //     -m# number of available colours (default 2 if -c not given)
  //     -c#,..,#  specify the maximum number of vertices of each colour
  //         The total must at least equal the number of vertices in the input.
  //     -d#,..,#  minimum vertex degree for each colour (out-degree for digraphs)
  //     -D#,..,#  maximum vertex degree for each colour (out-degree for digraphs)
  //               -d and -D can have fewer colours than -m/-c but not more
  //     -f# Use the group that fixes the first # vertices setwise
  //     -T  Use a simple text output format (nv ne {col} {v1 v2})
  //     -o  Use sparse6 (undirected) or digraph6 (directed) for output,
  //           provided m=2 and the inputs have no loops.
  //     -u  no output, just count them
  //     -q  suppress auxiliary information

  private static final int MAXNV = 128;   /* Maximum number of vertices */
  private static final String PER_COLOUR_FLAG = "per-colour";

  //private long vc_nin;
  private long mGeneratedCount = 0;

  protected VertexColourProcessor mOutProc = null;

  private int[] mColour = null;
  private boolean mFirst;
  private final int[] mLastReject = new int[MAXNV];
  private boolean mLastRejOk;
  private Z mGroupSize;
  private long mNewGroupSize;
  private int mFailLevel;

  /* test if col^p <= col */
  private boolean isMax(final int[] p, final int pos, final int n) {
    int fail = 0;
    for (int i = 0; i < n; ++i) {
      final int k = p[pos + i];
      if (k > fail) {
        fail = k;
      }
      if (mColour[k] > mColour[i]) {
        mFailLevel = fail;
        return false;
      } else if (mColour[k] < mColour[i]) {
        return true;
      }
    }
    ++mNewGroupSize;
    return true;
  }

  private final GroupAction mTestMax = new GroupAction() {
    @Override
    public boolean groupAction(final int[] p, final int pos, final int n) {
      if (mFirst) { /* only the identity */
        mFirst = false;
        return false;
      }
      if (!isMax(p, pos, n)) {
        if (n >= 0) {
          System.arraycopy(p, pos, mLastReject, 0, n);
        }
        mLastRejOk = true;
        return true;
      }
      return false;
    }
  };

  /* Try one solution, accept if maximal. */
  /* Return value is level to return to. */
  private int trythisone(final GroupRecord group, final Graph g, final int n) {
    final boolean accept;
    mNewGroupSize = 1;
    if (group == null || Z.ONE.equals(mGroupSize)) {
      accept = true;
    } else if (mLastRejOk && !isMax(mLastReject, 0, n)) {
      accept = false;
    } else if (mLastRejOk && Z.TWO.equals(mGroupSize)) {
      accept = true;
    } else {
      mNewGroupSize = 1;
      mFirst = true;
      accept = !NauGroup.allgroup2(group, mTestMax);
    }

    if (accept) {
      ++mGeneratedCount;
      if (mOutProc != null) {
        mOutProc.process(g, mColour);
      }
      return n - 1;
    } else {
      return mFailLevel - 1;
    }
  }

  /* Recursive scan for default case */
  /* Returned value is level to return to. */
  private int scan(final int level, final Graph g, final boolean digraph, final int[] prev, final int mincols, final int maxcols, final int sofar, final GroupRecord group) {
    final int n = g.order();
    if (level == n) {
      return trythisone(group, g, n);
    }

    final int left = n - level - 1;
    final int min = Math.max(0, mincols - sofar - mNumColours * left);
    int max = maxcols - sofar;
    if (max >= mNumColours) {
      max = mNumColours - 1;
    }
    if (prev[level] >= 0 && mColour[prev[level]] < max) {
      max = mColour[prev[level]];
    }

    for (int k = min; k <= max; ++k) {
      if (mColourCount[k] <= 0 || mMinDeg[k] > g.degree(level) || mMaxDeg[k] < g.degree(level)) {
        continue;
      }
      --mColourCount[k];
      mColour[level] = k;
      final int ret = scan(level + 1, g, digraph, prev, mincols, maxcols, sofar + k, group);
      ++mColourCount[k];
      if (ret < level) {
        return ret;
      }
    }

    return level - 1;
  }

  private void flip(final Graph g, final int i, final int j) {
    if (g.isAdjacent(i, j)) {
      g.removeEdge(i, j);
    } else {
      g.addEdge(i, j);
    }
  }

  /* Define (lab,ptn) with cells in increasing order of weight. */
  static void setlabptn(final int[] weight, final int[] lab, final int[] ptn, final int n) {
    if (n == 0) {
      return;
    }
    for (int i = 0; i < n; ++i) {
      lab[i] = i;
    }

    if (weight != null) {
      Sort.sort(Arrays.copyOf(weight, weight.length), lab); // lack of n?
      //sortwt(lab, weight, n);
      for (int i = 0; i < n - 1; ++i) {
        if (weight[lab[i]] != weight[lab[i + 1]]) {
          ptn[i] = 0;
        } else {
          ptn[i] = 1;
        }
      }
    } else {
      Arrays.fill(ptn, 0, n - 1, 1);
    }
    ptn[n - 1] = 0;
  }

  private void colourGraph(final Graph g, final int nfixed) {
    final int n = g.order();
    final OptionBlk options = new OptionBlk();
    final StatsBlk stats = new StatsBlk();
    final long[] workspace = new long[2 * n];
    mColour = new int[g.order()];
    final int[] lab = new int[g.order()];
    final int[] ptn = new int[g.order()];
    final boolean[] loop = new boolean[g.order()];
    final int[] prev = new int[g.order()]; /* If >= 0, earlier point that must have greater colour */
    final int[] weight = new int[g.order()];

    int nloops = 0;
    for (int i = 0; i < n; ++i) {
      if (g.isAdjacent(i, i)) {
        g.removeEdge(i, i);
        loop[i] = true;
        ++nloops;
      } else {
        loop[i] = false;
      }
    }

    int start;
    int stop;
    for (int region = 0; region < 2; ++region) {
      if (region == 0) {
        if (nfixed == 0) {
          continue;
        }
        start = 0;
        stop = nfixed;
        if (stop > n) {
          stop = n;
        }
      } else {
        if (nfixed >= n) {
          continue;
        }
        start = nfixed;
        stop = n;
      }

      for (int i = start; i < stop; ++i) {
        /* Find most recent equivalent j. */
        int j;
        for (j = i - 1; j >= start; --j) {
          if (loop[j] != loop[i]) {
            continue;
          }

          int u = -1;
          int v = -1;
          while ((u = g.nextVertex(i, u)) == (v = g.nextVertex(j, v)) && u != -1) {
            // do nothing
          }
          if (u != -1 || v != -1) {
            flip(g, i, j);
            u = -1;
            v = -1;
            while ((u = g.nextVertex(i, u)) == (v = g.nextVertex(j, v)) && u != -1) {
              // do nothing
            }
            flip(g, i, j);
          }
          if (u == -1 && v == -1) {
            break;
          }
        }
        if (j >= start) {
          prev[i] = j;
          weight[i] = weight[j] + 1;
        } else {
          prev[i] = -1;
          weight[i] = 0;
        }
      }
    }

    if (n == 0) {
      scan(0, g, false, prev, mMinColours, mMaxColours, 0, null);
      return;
    }

    for (int i = nfixed; i < n; ++i) {
      weight[i] += nfixed;
    }

    int maxcols = mMaxColours;
    if (maxcols == Multigraph.NOLIMIT || maxcols > n * mNumColours) {
      maxcols = n * mNumColours;
    }
    if (n * mNumColours < mMinColours) {
      return;
    }

    final NauGroup ng = new NauGroup();
    options.mUserAutomProc = ng;
    options.mUserLevelProc = ng;
    options.mDefaultPtn = false;
    options.mDigraph = nloops > 0;
    setlabptn(weight, lab, ptn, n);

    if (nloops > 0) {
      for (int i = 0; i < n; ++i) {
        if (loop[i]) {
          g.addEdge(i, i);
        }
      }
    }

    final int[] orbits = new int[g.order()];
    new Nauty(g, lab, ptn, null, orbits, options, stats, workspace);

    mGroupSize = stats.mGrpSize;
    final GroupRecord group = ng.groupPtr(false);
    ng.makeCosetReps(group);

    if (stats.mNumOrbits < n) {
      int j = n;
      for (int i = 0; i < n; ++i) {
        if (orbits[i] < i && orbits[i] < j) {
          j = orbits[i];
        }
      }

      for (int i = j + 1; i < n; ++i) {
        if (orbits[i] == j) {
          prev[i] = j;
        }
      }
    }

    mLastRejOk = false;
    Arrays.fill(mColour, 0, n, 0);
    scan(0, g, false, prev, mMinColours, maxcols, 0, group);
  }

// static void
// colourdigraph(graph *g, int nfixed, long mincols, long maxcols, long *colcount, long *mindeg, long *maxdeg, long *deg, long numcols, int m, int n)
// {
//     static DEFAULTOPTIONS_GRAPH(options);
//     statsblk stats;
//     setword workspace[2*MAXNV];
//     GroupRecordgroup;
//     int i,j,k,nloops;
//     size_t ii;
//     set *gi,*gj,*gci,*gcj;
//     int lab[MAXNV],ptn[MAXNV],orbits[MAXNV];
//     boolean loop[MAXNV];
//     int prev[MAXNV]; /* If >= 0, earlier point that must have greater colour */
//     int weight[MAXNV];
//     int region,start,stop;
//     DYNALLSTAT(graph,gconv,gconv_sz);

//     if (n > MAXNV) gt_abort(">E vcolg: MAXNV exceeded\n");
//     nauty_check(WORDSIZE,m,n,NAUTYVERSIONID);

//     DYNALLOC2(graph,gconv,gconv_sz,n,m,"colourdigraph");

//     nloops = 0;
//     for (i = 0, gi = g; i < n; ++i, gi += m)
//         if (ISELEMENT(gi,i))
//   {
//       DELELEMENT(gi,i);
//       loop[i] = true;
//       ++nloops;
//   }
//   else
//       loop[i] = false;
//     for (ii = 0; ii < m*(size_t)n; ++ii) gconv[ii] = g[ii];
//     converse(gconv,m,n);
//     for (region = 0; region < 2; ++region)
//     {
//   if (region == 0)
//   {
//       if (nfixed == 0) continue;
//       start = 0;
//       stop = nfixed;
//       if (stop > n) stop = n;
//   }
//   else
//   {
//       if (nfixed >= n) continue;
//       start = nfixed;
//       stop = n;
//   }
//   for (i = start,
//                     gi = g + m*(size_t)start, gci = gconv + m*(size_t)start;
//              i < stop; ++i, gi += m, gci += m)
//   {
//             /* Find most recent equivalent j. */
//       for (j = i-1, gj = gi-m, gcj = gci-m; j >= start;
//                                                    --j, gj -= m, gcj -= m)
//       {
//     if (loop[j] != loop[i]
//                        || ISELEMENT(gi,j) != ISELEMENT(gj,i)) continue;
//     for (k = 0; k < m; ++k)
//                      if (gi[k] != gj[k] || gci[k] != gcj[k]) break;
//     if (k < m)
//     {
//         FLIPELEMENT(gi,i); FLIPELEMENT(gj,j);
//         FLIPELEMENT(gci,i); FLIPELEMENT(gcj,j);
//         for (k = 0; k < m; ++k)
//                         if (gi[k] != gj[k] || gci[k] != gcj[k]) break;
//         FLIPELEMENT(gci,i); FLIPELEMENT(gcj,j);
//         FLIPELEMENT(gi,i); FLIPELEMENT(gj,j);
//     }
//     if (k == m) break;
//       }
//       if (j >= start)
//       {
//     prev[i] = j;
//     weight[i] = weight[j] + 1;
//       }
//       else
//       {
//     prev[i] = -1;
//     weight[i] = 0;
//       }
//   }
//     }

//     for (i = nfixed; i < n; ++i) weight[i] += nfixed;
//     if (maxcols == NOLIMIT || maxcols > n*numcols) maxcols = n*numcols;
//     if (n*numcols < mincols) return;
//     if (n == 0)
//     {
//         scan(0,g,true,prev,mincols,maxcols,0,colcount,
//              mindeg,maxdeg,deg,numcols,false,m,n);
//         return;
//     }
//     options.userautomproc = groupautomproc;
//     options.userlevelproc = grouplevelproc;
//     options.defaultptn = false;
//     options.digraph = true;
//     options.invarproc = adjacencies;
//     options.maxinvarlevel = n;
//     setlabptn(weight,lab,ptn,n);
//     if (nloops > 0)
//         for (i = 0, gi = g; i < n; ++i, gi += m)
//       if (loop[i]) ADDELEMENT(gi,i);
//     nauty(g,lab,ptn,null,orbits,&options,&stats,workspace,2*MAXNV,m,n,null);
//     if (stats.grpsize2 == 0)
//         groupsize = stats.grpsize1 + 0.1;
//     else
//         groupsize = 0;

//     group = groupptr(false);
//     makecosetreps(group);
//     if (stats.numorbits < n)
//     {
//   j = n;
//   for (i = 0; i < n; ++i)
//       if (orbits[i] < i && orbits[i] < j) j = orbits[i];
//   for (i = j + 1; i < n; ++i)
//       if (orbits[i] == j) prev[i] = j;
//     }
//     lastrejok = false;
//     for (i = 0; i < n; ++i) col[i] = 0;
//     scan(0,g,true,prev,mincols,maxcols,0,colcount,mindeg,maxdeg,deg,numcols,group,m,n);
// }

// int
// main(int argc, char *argv[])
  // note a lot of this deleted
//     if (badargs || argnum > 2)
//     {
//         fprintf(stderr,">E Usage: %s\n",USAGE);
//         GETHELP;
//         exit(1);
//     }

//     if ((Tswitch!=0) + (oswitch!=0) + (uswitch!=0) >= 2)
//         gt_abort(">E vcolg: -T, -o and -u are incompatible\n");

//     if (!mswitch) numcols = 2;

//     if (oswitch && numcols != 2)
//         gt_abort(">E vcolg: -o is only allowed for 2 colours\n");

//     if (!eswitch)
//     {
//         mincols = 0;
//         maxcols = NOLIMIT;
//     }
//     if (!fswitch) nfixed = 0;

//     if (cswitch && mswitch && numcols != collen)
//   gt_abort(">E vcolg: -m and -c disagree on number of colours\n");

//     if (cswitch)
//     {
//   numcols = collen;
//   totcols = 0;
//   for (i = 0; i < numcols; ++i)
//       if (colcount[i] < 0)
//     gt_abort(">E vcolg: negative counts not allowed for -c\n");
//       else
//       {
//     totcols += colcount[i];
//     if (totcols < 0) { totcols = NOLIMIT; break; } /* catch overflow */
//       }
//     }
//     else
//   for (i = 0; i < numcols; ++i) colcount[i] = NOLIMIT;

//     if (dswitch && dlen > numcols)
//         gt_abort(">E vcolg: -d has too many colours\n");
//     if (Dswitch && Dlen > numcols)
//   gt_abort(">E vcolg: -D has too many colours\n");

//     for (i = (dswitch ? dlen : 0); i < numcols; ++i)
//   mindeg[i] = 0;
//     for (i = (Dswitch ? Dlen : 0); i < numcols; ++i)
//   maxdeg[i] = NOLIMIT;
//     for (i = 0; i < numcols; ++i)
//   if (mindeg[i] > maxdeg[i])
//       gt_abort(">E vcolg : contradictory bound from -d/-D\n");

//     if (cswitch && !qswitch)
//     { 
//         fprintf(stderr,">c"); for (i = 0; i < numcols; ++i)
//       fprintf(stderr," %ld",colcount[i]);
//         fprintf(stderr,"\n");
//     }

//     if (dswitch && !qswitch)
//     { 
//         fprintf(stderr,">d");
//         for (i = 0; i < numcols; ++i)
//       fprintf(stderr," %ld",mindeg[i]);
//         fprintf(stderr,"\n");
//     }

//     if (Dswitch && !qswitch)
//     { 
//         fprintf(stderr,">D");
       
//         for (i = 0; i < numcols; ++i)
//       if (maxdeg[i] == NOLIMIT) fprintf(stderr," -");
//       else                      fprintf(stderr," %ld",maxdeg[i]);
//         fprintf(stderr,"\n");
//     }

//     vc_nin = vc_nout = 0;

//     t = CPUTIME;
//     while (true)
//     {
//         if ((g = readgg(infile,null,0,&m,&n,&digraph)) == null) break;
//         ++vc_nin;

//   if (cswitch && n > totcols)
//       gt_abort(">E vcolg: not enough colours for input\n");

//         if (oswitch && loopcount(g,m,n) > 0)
//             gt_abort(">E vcolg: loops in input are not allowed for -o\n");

//   for (i = 0, gi = g; i < n; ++i, gi += m)
//   {
//       deg[i] = 0;
//       for (j = 0; j < m; ++j) deg[i] += POPCOUNT(gi[j]);
//   }

//   if (!digraph)
//             colourgraph(g,nfixed,mincols,maxcols,colcount, mindeg,maxdeg,deg,numcols,m,n);
//   else
//       colourdigraph(g,nfixed,mincols,maxcols,colcount, mindeg,maxdeg,deg,numcols,m,n);

//   if (!uswitch && ferror(outfile)) gt_abort(">E vcolg output error\n");
//         FREES(g);
//     }
//     t = CPUTIME - t;

//     if (!qswitch)
//     {
//         fprintf(stderr,">Z ");
//         PRINT_COUNTER(stderr,vc_nin);
//         fprintf(stderr," graphs read from %s",infilename);
//         fprintf(stderr,"; ");
//         PRINT_COUNTER(stderr,vc_nout);
//         if (!uswitch)
//             fprintf(stderr," coloured graphs written to %s",outfilename);
//         else
//             fprintf(stderr," coloured graphs generated");
//         fprintf(stderr,"; %.2f sec\n",t);
//     }
//     exit(0);
// }

  private final int mNumColours;
  private final int mMinColours;
  private final int mMaxColours;
  private final int[] mColourCount;
  private final int[] mMinDeg;
  private final int[] mMaxDeg;

  private static int[] maxArray(final int n) {
    final int[] res = new int[n];
    Arrays.fill(res, Multigraph.NOLIMIT);
    return res;
  }

  /**
   * Construct an instance for colouring with the specified number of colours.
   * @param numColours total number of colours allowed
   * @param minColours minimum number of colours allowed
   * @param maxColours maximum number of colours allowed.
   * @param colourCount maximum number of vertices of each colour.
   * @param minDeg minimum vertex degree for each colour
   * @param maxDeg maximum vertex degree for each colour
   */
  public VertexColour(final int numColours, final int minColours, final int maxColours, final int[] colourCount, final int[] minDeg, final int[] maxDeg) {
    if (minColours > numColours) {
      throw new IllegalArgumentException("Minimum colours exceeds number of colours.");
    }
    if (maxColours < minColours) {
      throw new IllegalArgumentException("Maximum colours is small than minimum colours.");
    }
    if (colourCount.length != numColours) {
      throw new IllegalArgumentException("colourCount array has wrong length: " + colourCount.length + " cf. " + numColours);
    }
    if (minDeg.length != numColours) {
      throw new IllegalArgumentException("minDeg array has wrong length: " + minDeg.length + " cf. " + numColours);
    }
    if (maxDeg.length != numColours) {
      throw new IllegalArgumentException("maxDeg array has wrong length: " + maxDeg.length + " cf. " + numColours);
    }
    mNumColours = numColours;
    mMinColours = minColours;
    mMaxColours = maxColours;
    mColourCount = Arrays.copyOf(colourCount, colourCount.length);
    mMinDeg = Arrays.copyOf(minDeg, minDeg.length);
    mMaxDeg = Arrays.copyOf(maxDeg, maxDeg.length);
  }

  /**
   * Construct an instance for colouring with the specified number of colours.
   * @param numColours total number of colours allowed
   * @param minColours minimum number of occurrences of a colour
   * @param maxColours maximum number of occurrences of a colour
   */
  public VertexColour(final int numColours, final int minColours, final int maxColours) {
    this(numColours, minColours, maxColours, maxArray(numColours), new int[numColours], maxArray(numColours));
  }

  /**
   * Construct an instance for colouring with the specified number of colours.
   * @param numColours total number of colours allowed
   */
  public VertexColour(final int numColours) {
    this(numColours, 0, Multigraph.NOLIMIT);
  }

  /**
   * Colour the graph is all possible ways, subject to the constraints of this instance,
   * sending each graph to the supplied processor.
   * @param g graph to colour
   * @param proc when to send the graphs.
   */
  public long colour(final Graph g, final VertexColourProcessor proc) {
    mOutProc = proc;
    mGeneratedCount = 0;
    colourGraph(g, 0);
    return mGeneratedCount;
  }

  private static CliFlags initFlags() {
    final CliFlags flags = new CliFlags("VertexColour", "Generate all vertex colourings of a graph with given constraints.");
    flags.registerOptional('q', GenerateGraphsCli.QUIET_FLAG, "produce less output");
    flags.registerOptional('m', "colours", Integer.class, "INTEGER", "number of colours", 2);
    flags.registerOptional('d', GenerateGraphsCli.MIN_DEGREE_FLAG, String.class, "INTEGER+", "minimum vertex degree for each colour");
    flags.registerOptional('D', GenerateGraphsCli.MAX_DEGREE_FLAG, String.class, "INTEGER+", "maximum vertex degree for each colour");
    flags.registerOptional('c', PER_COLOUR_FLAG, String.class, "INTEGER+", "maximum number of vertices of each colour");
    return flags;
  }

  private static int[] stringToIntArray(final String s) {
    final String[] parts = s.split(",");
    final int[] res = new int[parts.length];
    for (int k = 0; k < parts.length; ++k) {
      res[k] = Integer.parseInt(parts[k]);
    }
    return res;
  }

  /**
   * Main program for colouring graphs.
   * @param args see usage clues above
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = initFlags();
    flags.setFlags(args);
    //final boolean uSwitch = flags.isSet(GenerateGraphsCli.NO_OUTPUT_FLAG);

    final int numColours = (int) flags.getValue("colours");
    final int[] minDeg = flags.isSet(GenerateGraphsCli.MIN_DEGREE_FLAG)
      ? stringToIntArray((String) flags.getValue(GenerateGraphsCli.MIN_DEGREE_FLAG))
      : new int[numColours];
    final int[] maxDeg = flags.isSet(GenerateGraphsCli.MAX_DEGREE_FLAG)
      ? stringToIntArray((String) flags.getValue(GenerateGraphsCli.MAX_DEGREE_FLAG))
      : maxArray(numColours);
    final int[] colourCount = flags.isSet(PER_COLOUR_FLAG)
      ? stringToIntArray((String) flags.getValue(PER_COLOUR_FLAG))
      : maxArray(numColours);

    final VertexColour vc = new VertexColour(numColours, 0, Multigraph.NOLIMIT, colourCount, minDeg, maxDeg);
    double t = System.currentTimeMillis();
    long inGraphs = 0;
    long totalCount = 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        ++inGraphs;
        final Graph g = Graph6.toGraph(line);
        totalCount += vc.colour(g, null);
      }
    }
    t = System.currentTimeMillis() - t;
    if (!flags.isSet(GenerateGraphsCli.QUIET_FLAG)) {
      System.err.println(">Z " + inGraphs + " graphs read from stdin; " + totalCount + " coloured graphs generated" + String.format("; %.2f sec", t / 1000));
    }
  }
}
