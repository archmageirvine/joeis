package irvine.math.nauty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.Graph6;
import irvine.math.graph.GraphFactory;
import irvine.util.CliFlags;

/**
 * Generate all possible non-isomorphic directed graphs for each input undirected graph.
 * @author Sean A. Irvine (Java port)
 * @author B. D. McKay
 */
public class DirectedGraph implements GroupAction {

  // based on directg version 1.7; B D McKay, May 22, 2011

  // todo these should be constructor time?
  private static final int MAXNV = 128;
  private static final int MAXNE = 1024;
  private static final int WORDSIZE = 64;
  private static final int MAXME = (2 * MAXNE + WORDSIZE - 1) / WORDSIZE;

  private static boolean sGSwitch;
  private static boolean sVSwitch;

  private long mGraphsRead = 0;
  private long mNumGenerated = 0;
  private long mGraphsOutput = 0;
  protected PrintStream mOut = null;

  private final int[] mV0 = new int[MAXNE];
  private final int[] mV1 = new int[MAXNE];
  private final int[][] mEdgeNo = new int[MAXNV][MAXNV];


  private final NautySet mX = new NautySet(MAXME);
  private final int[] mIx = new int[2 * MAXNE];
  private int mNix;
  private boolean mFirst;
  private int mNe;
  private final int[] mLastReject = new int[MAXNV];
  private boolean mLastRejOk;
  private int mRejectLevel;
  private long mGroupSize;
  private long mNewGroupSize;
  private boolean mNtGroup;
  private boolean mNtIsol;

/* DEGPRUNE feature // !!!! NOT CURRENTLY SUPPORTED IN JAVA
 *
 * If DEGPRUNE is defined it must have a value equal to the name of a 
 * procedure to be supplied by the user and linked to this program.
 * The prototype must be
 *   int DEGPRUNE(int[] indeg, int outdeg*, int v, int n)
 * Here n is the number of vertices altogether, and v (0..n-1) is the
 * number of one vertex.  At this point in the program, some directed
 * edges have been inserted, and the indegrees and outdegrees have the
 * values given in indeg[] and outdeg[].  Moreover, it is known that
 * no further edges will be added to or from v, so indeg[v] and outdeg[v]
 * are final.  If DEGPRUNE returns a non-zero value, this branch of the
 * search will be abandoned.
 * Before any graph is output, DEGPRUNE will have been called for every
 * vertex, but it cannot be assumed that DEGPRUNE will be called in order
 * of vertex number.
 */

  /* process feature
   *
   * If process is defined, it must expand as the name of a procedure
   * with prototype like void process(FILE *f, graph *g, int n). This
   * procedure will be called for each output graph before it is output,
   * with f being the output file (possibly null).
   * It is an error if n > WORDSIZE.
   */
  protected void process(final Graph g) {
  }


  /* summary feature
   *
   * If summary is defined, it must expand as the name of a procedure
   * with prototype  void summary(void).  It is called at the end before
   * the normal summary (which can be suppressed with -q).  The numbers of
   * graphs read and digraphs produced are available in the global variables
   * mGraphsRead and mGraphsOutput (type long).
   */
  protected void summary() {
  }

  /* Called by allgroup. */
  void writeautom(final int[] p, final int n) {
    for (int i = 0; i < n; ++i) {
      System.out.format(" %2d", p[i]);
    }
    System.out.println();
  }

  // Java 8 has a method to do this
  private static long compareUnsigned(final long a, final long b) {
    return ((a ^ b) >> 63) == 0 ? a - b : (a < 0 ? 1 : -1);
  }

  /* test if x^p <= x */
  private boolean isMax(final int[] p, final int pos, final int n) {

    // Note care is needed with the comparisons here, since we need to treat the long
    // blocks in the set as unsigned 64-bit quantities.

    final NautySet px = new NautySet(mNe);

    for (int j = 0; j < mNix; ++j) {
      final int i = mIx[j];
      final int k = i >>> 1;
      if ((i & 1) == 1) {
        px.set(mEdgeNo[p[pos + mV1[k]]][p[pos + mV0[k]]]);
      } else {
        //System.out.printf("eno=%d v0[k]=%d v1[k]=%d p0=%d p1=%d\n", mEdgeNo[p[pos + mV0[k]]][p[pos + mV1[k]]], mV0[k], mV1[k], p[pos + mV0[k]], p[pos + mV1[k]]);
        px.set(mEdgeNo[p[pos + mV0[k]]][p[pos + mV1[k]]]);
      }

      //System.out.printf("j=%d, px0=%d, mx0=%d i=%d\n", j, px.getBlock(0), mX.getBlock(0), i);
      if (compareUnsigned(px.getBlock(0), mX.getBlock(0)) > 0) {
        mRejectLevel = k;
        return false;
      }
    }

    mRejectLevel = MAXNE + 1;

    if (compareUnsigned(px.getBlock(0), mX.getBlock(0)) < 0) {
      return true;
    }

    for (int i = 1; i < mNe; ++i) {
      if (compareUnsigned(px.getBlock(i), mX.getBlock(i)) > 0) {
        return false;
      } else if (compareUnsigned(px.getBlock(i), mX.getBlock(i)) < 0) {
        return true;
      }
    }

    ++mNewGroupSize;
    mNtGroup = true;
    return true;
  }


  @Override
  public void groupAction(final int[] p, final int pos, final int n, final int[] abort) {
    if (mFirst) {       /* only the identity */
      mFirst = false;
      return;
    }
//    for (int k = 0; k < n; ++k) {
//      System.out.printf(" %d", p[pos + k]);
//    }
//    System.out.println(" groupAction");
    if (!isMax(p, pos, n)) {
      abort[0] = 1;
      System.arraycopy(p, pos, mLastReject, 0, n);
      mLastRejOk = true;
    }
  }

  private int tryThisOne(final GroupRecord group, final int ne, final int n) {
    mFirst = true;
    ++mNumGenerated;
    mNix = ne;
    mNewGroupSize = 1;
    mNtGroup = false;

//    System.out.printf("groupsize=%d\n", mGroupSize);
//    for (int k = 0; k < n; ++k) {
//      System.out.printf(" %d", mLastReject[k]);
//    }
//    System.out.println();

    final boolean accept;
    if (group == null || mGroupSize == 1) {
      accept = true;
    } else if (mLastRejOk && !isMax(mLastReject, 0, n)) {
      accept = false;
    } else if (mLastRejOk && mGroupSize == 2) {
      accept = true;
    } else {
      mNewGroupSize = 1;
      mNtGroup = false;
      accept = NauGroup.allgroup2(group, this) == 0;
    }

    //System.out.println("getCount is " + getCount);
    if (accept) {
      if (sVSwitch && !mNtIsol && !mNtGroup) {
        return MAXNE + 1;
      }

      ++mGraphsOutput;

      // This block is no really needed unless process does something ...
      final Graph g = GraphFactory.createDigraph(n);
      for (int i = -1; (i = mX.next(i)) >= 0; ) {
        final int k = i >>> 1;
        if ((i & 1) == 1) {
          g.addEdge(mV1[k], mV0[k]);
        } else {
          g.addEdge(mV0[k], mV1[k]);
        }
      }
      process(g);
      // End of process block

      if (mOut != null) {
        mOut.print(n + " " + ne);
        if (sGSwitch) {
          mOut.print(" " + mNewGroupSize);
        }

        for (int i = -1; (i = mX.next(i)) >= 0; ) {
          final int k = i >>> 1;
          if ((i & 1) == 1) {
            mOut.print(" " + mV1[k] + " " + mV0[k]);
          } else {
            mOut.print(" " + mV0[k] + " " + mV1[k]);
          }
        }
        mOut.println();
      }
      return MAXNE + 1;
    } else {
      return mRejectLevel;
    }
  }

  /* Main recursive scan; returns the level to return to. */
  private int scan(final int level, final int ne, final int minArcs, final int maxArcs, final int soFar,
           final boolean oriented, final GroupRecord group, final int n) {

    //System.out.printf("scan level=%d ne=%d minArcs=%d maxArcs=%d soFar=%d n=%d\n", level, ne, minArcs, maxArcs, soFar, n);

    if (level == ne) {
      return tryThisOne(group, soFar, n);
    }

    if (oriented || soFar + 1 + 2 * (ne - level - 1) >= minArcs) {
      int k = 2 * level;
      mX.set(k);
      mIx[soFar] = k;
      int retlev = scan(level + 1, ne, minArcs, maxArcs, soFar + 1, oriented, group, n);
      mX.clear(k);
      if (retlev < level) {
        return retlev;
      }
      ++k;
      mX.set(k);
      mIx[soFar] = k;
      retlev = scan(level + 1, ne, minArcs, maxArcs, soFar + 1, oriented, group, n);
      mX.clear(k);
      if (retlev < level) {
        return retlev;
      }
    }

    if (!oriented && soFar + 2 + ne - level - 1 <= maxArcs) {
      final int k = 2 * level;
      mX.set(k);
      mX.set(k + 1);
      mIx[soFar] = k;
      mIx[soFar + 1] = k + 1;
      final int retlev = scan(level + 1, ne, minArcs, maxArcs, soFar + 2, oriented, group, n);
      mX.clear(k + 1);
      mX.clear(k);
      if (retlev < level) {
        return retlev;
      }
    }

    return level - 1;
  }

  /**
   * Generate all possible digraphs from the given graph subject to constraints.
   * @param g graph
   * @param nFixed fixed points
   * @param minArcs minimum number of edges
   * @param maxArcs maximum number of edges
   * @param orientOneDirectionOnly true if each edge is to be oriented at most one way
   * @throws IOException if an I/O error occurs.
   */
  public void direct(final Graph g, final int nFixed, final int minArcs, final int maxArcs,
                     final boolean orientOneDirectionOnly) throws IOException {
    final int n = g.order();
    final int[] lab = new int[MAXNV];
    final int[] ptn = new int[MAXNV];
    final int[] orbits = new int[MAXNV];

    int j0 = -1;  /* last vertex with degree 0 */
    int j1 = n;   /* first vertex with degree > 0 */
    int isol0 = 0;  /* isolated vertices before and after nFixed */
    int isol1 = 0;

    int ne = 0;
    for (int i = 0; i < n; ++i) {
      final int deg = (int) g.degree(i);
      if (deg == 0) {
        lab[++j0] = i;
        if (i < nFixed) {
          ++isol0;
        } else {
          ++isol1;
        }
      } else {
        lab[--j1] = i;
      }
      ne += deg;
    }
    ne /= 2;
    mNtIsol = isol0 >= 2 || isol1 >= 2;

    mNe = Math.max(1, (2 * ne + WORDSIZE - 1) / WORDSIZE);
    mX.clear();

    if (ne == 0 && minArcs <= 0 && (!sVSwitch || mNtIsol)) {
      tryThisOne(null, 0, n);
      return;
    }

    if (orientOneDirectionOnly) {
      if (maxArcs < ne || minArcs > ne) {
        return;
      }
    } else {
      if (maxArcs < ne || minArcs > 2 * ne) {
        return;
      }
    }

    if (n > MAXNV || ne > MAXNE) {
      throw new RuntimeException(">E directg: MAXNV or MAXNE exceeded");
    }

    Arrays.fill(ptn, 0, n, 1);
    ptn[n - 1] = 0;
    final NautySet active = new NautySet((MAXNV + WORDSIZE - 1) / WORDSIZE);
    active.set(0);

    for (int i = 0; i <= j0; ++i) {
      if (i < n - 1) {
        active.set(i + 1);
      }
      ptn[i] = 0;
    }

    int i;
    for (i = j0 + 1; i < n; ++i) {
      if (lab[i] < nFixed) {
        break;
      }
    }
    if (i != j0 + 1 && i != n) {
      ptn[i - 1] = 0;
      active.set(i);
    }

    final OptionBlk options = new OptionBlk();
    final StatsBlk stats = new StatsBlk();
    final NauGroup ng = new NauGroup();
    options.mDefaultPtn = false;
    options.mUserAutomProc = ng;
    options.mUserLevelProc = ng;

    new Nauty(g, lab, ptn, active, orbits, options, stats, new long[100]);

    mGroupSize = stats.groupSize().longValueExact();
    if (sVSwitch && mGroupSize == 1 && !mNtIsol) {
      return;
    }

    final GroupRecord group = ng.groupPtr(false);
    ng.makeCosetReps(group);

    int k = 0;
    for (i = 0; i < n; ++i) {
      for (int j = i; (j = g.nextVertex(i, j)) >= 0; ) {
        mV0[k] = i;
        mV1[k] = j;
        mEdgeNo[i][j] = 2 * k;
        mEdgeNo[j][i] = 2 * k + 1;
        ++k;
      }
    }

    mLastRejOk = false;

    scan(0, ne, minArcs, maxArcs, 0, orientOneDirectionOnly, group, n);
  }

  static final String EDGES_FLAG = "edges";
  private static final String ORIENT_FLAG = "orient";

  private static CliFlags initFlags() {
    final CliFlags flags = new CliFlags("DirectedGraph", "Generate all digraphs from input graphs with given constraints.");
    flags.registerOptional('u', GenerateGraphsCli.NO_OUTPUT_FLAG, "do not output generated graphs, just count them");
    flags.registerOptional('T', Multigraph.TEXT_FLAG, "use a simple text output format (nv ne edges) instead of digraph6");
    flags.registerOptional('G', Multigraph.GROUP_SIZE_FLAG, "like -T but includes group size as third item (if less than 10^10). The group size does not include exchange of isolated vertices.");
    flags.registerOptional('o', ORIENT_FLAG, "orient each edge in only one direction, never both");
    flags.registerOptional('e', EDGES_FLAG, String.class, "min[:max]", "specify a value or range of the total number of arcs");
    flags.registerOptional('q', GenerateGraphsCli.QUIET_FLAG, "produce less output");
    flags.registerOptional('f', Multigraph.FIX_FLAG, Integer.class, "INTEGER", "use the group that fixes the first n vertices setwise", 0);
    flags.registerOptional('v', GenerateGraphsCli.VERBOSE_FLAG, "display counts by number of edges");
    return flags;
  }

  /**
   * Main program for directed graph generation.
   * @param args command line arguments
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = initFlags();
    flags.setFlags(args);

    final int nfixed = (Integer) flags.getValue(Multigraph.FIX_FLAG);
    //final boolean textSwitch = flags.isSet(Multigraph.TEXT_FLAG);
    final boolean uSwitch = flags.isSet(GenerateGraphsCli.NO_OUTPUT_FLAG);
    final boolean oswitch = flags.isSet(ORIENT_FLAG);
    final boolean qSwitch = flags.isSet(GenerateGraphsCli.QUIET_FLAG);
    sGSwitch = flags.isSet(Multigraph.GROUP_SIZE_FLAG);
    sVSwitch = flags.isSet(GenerateGraphsCli.VERBOSE_FLAG);
    int minArcs = 0;
    int maxArcs = Multigraph.NOLIMIT;

    if (flags.isSet(EDGES_FLAG)) {
      final String v = (String) flags.getValue(EDGES_FLAG);
      final int colon = v.indexOf(':');
      if (colon != 0) {
        minArcs = Integer.parseInt(colon == -1 ? v : v.substring(0, colon));
      }
      if (colon >= 0 && colon != v.length() - 1) {
        maxArcs = Integer.parseInt(v.substring(colon + 1));
      } else {
        maxArcs = minArcs;
      }
    }

//  for (j = 1; !badargs && j < argc; ++j) {
//    arg = argv[j];
//    if (arg[0] == '-' && arg[1] != '\0') {
//    ++arg;
//    while (*arg != '\0')
//    {
//      sw =*arg++;
//      SWBOOLEAN('o', oswitch)
//    }
//    } else {
//    ++argnum;
//    if (argnum == 1) infilename = arg;
//    else if (argnum == 2) outfilename = arg;
//    else badargs = true;
//    }
//  }
//
//  if (badargs || argnum > 2) {
//    fprintf(stderr, ">E Usage: %s\n", USAGE);
//    GETHELP;
//    exit(1);
//  }

//  if ((sGSwitch != 0) + (textSwitch != 0) + (uSwitch != 0) >= 2)
//    gt_abort(">E directg: -G, -T and -u are incompatible\n");
//
//  if (!textSwitch && !sGSwitch && !uSwitch)
//    gt_abort(
//    ">E directg: digraph6 output is unimplemented; use -T or -G\n");


    final DirectedGraph dg = new DirectedGraph();
    if (!uSwitch) {
      dg.mOut = System.out;
    }
    double t = System.currentTimeMillis();

    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        final Graph g = Graph6.toGraph(line);
        dg.mGraphsRead++;
        dg.direct(g, nfixed, minArcs, maxArcs, oswitch);
      }
    }
    t = System.currentTimeMillis() - t;

    dg.summary();

    if (!qSwitch) {
      final StringBuilder sb = new StringBuilder(">Z ")
        .append(dg.mGraphsRead)
        .append(" graphs read from stdin")
        .append("; ")
        .append(dg.mGraphsOutput);
      if (!uSwitch) {
        sb.append(" digraphs written to stdout");
      } else {
        sb.append(" digraphs generated");
      }
      sb.append(String.format("; %.2f sec", t / 1000));
      System.err.println(sb.toString());
    }
  }

  /*
  "directg [-q] [-u|-T|-G] [-V] [-o] [-f#] [-e#|-e#:#] [infile [mOut]]"

" Read undirected graphs and orient their edges in all possible ways.\n\
  Edges can be oriented in either or both directions (3 possibilities).\n\
  Isomorphic directed graphs derived from the same input are suppressed.\n\
  If the input graphs are non-isomorphic then the output graphs are also.\n\
\n\
   -e# | -e#:#  specify a value or range of the total number of arcs\n\
  -o   orient each edge in only one direction, never both\n\
   -f#  Use only the subgroup that fixes the first # vertices setwise\n\
\n\
  -T  use a simple text output format (nv ne edges) instead of digraph6\n\
  -G  like -T but includes group size as third item (if less than 10^10)\n\
    The group size does not include exchange of isolated vertices.\n\
  -V  only output graphs with nontrivial groups (including exchange of\n\
    isolated vertices).  The -f option is respected.\n\
  -u  no output, just count them\n\
  -q  suppress auxiliary information\n"
  */

}
