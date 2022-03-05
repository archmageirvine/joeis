package irvine.math.nauty;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.z.Z;
import irvine.util.array.Sort;

/**
 * Vertex colouring.
 * @author Brendan McKay
 * @author Sean A. Irvine (Java port)
 */
class VertexColour {

// Based on vcolg.c version 3.1; B D McKay, Apr 24, 2021

// #define USAGE \
// "vcolg [-q] [-u|-T|-o] [-e#|-e#:#] [-m#] [-c#,..,#] [-f#] [infile [outfile]]"

// #define HELPTEXT \
// "  Read graphs or digraphs and colour their vertices in\n\
//   in all possible ways with colours 0,1,2,... .\n\
//   Isomorphic graphs derived from the same input are suppressed.\n\
//   If the input graphs are non-isomorphic then the output graphs are also.\n\
// \n\
//     -e# | -e#:#  specify a value or range of the total value of the colours\n\
//     -m# number of available colours (default 2 if -c not given)\n\
//     -c#,..,#  specify the maximum number of vertices of each colour\n\
//         The total must at least equal the number of vertices in the input.\n\
//     -d#,..,#  minimum vertex degree for each colour (out-degree for digraphs)\n\
//     -D#,..,#  minimum vertex degree for each colour (out-degree for digraphs)\n\
// 	-d and -D can have fewer colours than -m/-c but not more\n\
//     -f# Use the group that fixes the first # vertices setwise\n\
//     -T  Use a simple text output format (nv ne {col} {v1 v2})\n\
//     -o  Use sparse6 (undirected) or digraph6 (directed) for output,\n\
//           provided m=2 and the inputs have no loops.\n\
//     -u  no output, just count them\n\
//     -q  suppress auxiliary information\n"

// /*************************************************************************/


private long vc_nin;
private long mGeneratedCount = 0;
private PrintStream outfile = null;

private static final int MAXNV = 128;   /* Maximum number of vertices */

  protected VertexColourProcessor mOutProc = null;

  private int[] mColour = null;
private boolean first;
private final int[] lastreject = new int[MAXNV];
private boolean lastrejok;
private Z groupsize;
private long newgroupsize;
// static boolean Tswitch,oswitch;

private int mFailLevel;

// #define GROUPTEST_NOT 
// #ifdef GROUPTEST
// static long long totallab;
// #endif

/* If OUTPROC is defined at compile time, and -u is not used, the
 * procedure OUTPROC is called for each graph.  This must be linked
 * by the compiler.  The arguments are
 * f = open output file
 * g = the input graph
 * col[0..n-1] = the colours
 * m,n = usual nauty meanings
 */

/* SUMMARY feature
 *
 * If SUMMARY is defined, it must expand as the name of a procedure
 * with prototype  void SUMMARY(void).  It is called at the end before
 * the normal summary (which can be suppressed with -q).  The numbers of
 * graphs read and coloured graphs produced are available in the global
 * variables vc_nin and vc_nout (type nauty_counter).
 */

// #ifdef OUTPROC
// extern void OUTPROC(FILE*,graph*,int*,int,int);
// #endif

// #ifdef SUMMARY
// extern void SUMMARY(void);
// #endif

///* Called by allgroup. */
//static void writeautom(int[] p, int n) {
//    int i;
//
//    for (i = 0; i < n; ++i) printf(" %2d",p[i]);
//    printf("\n");
//}

  /* test if col^p <= col */
  private boolean ismax(final int[] p, final int n) {
    int fail = 0;
    for (int i = 0; i < n; ++i) {
      final int k = p[i];
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

    ++newgroupsize;
    return true;
  }

  private final GroupAction testmax = new GroupAction() {
    @Override
    public void groupAction(final int[] p, final int pos, final int n, final int[] abort) {
      if (first) { /* only the identity */
        first = false;
        return;
      }
      if (!ismax(p, n)) {
        abort[0] = 1;
        if (n >= 0) {
          System.arraycopy(p, 0, lastreject, 0, n);
        }
        lastrejok = true;
      }
    }
  };


//static void writeone(FILE *outfile, graph *g, int[] col, boolean digraph, int m, int n) {
//    int i;
//    set *gi;
//
//    for (i = 0, gi = g; i < n; ++i, gi += m)
//        if (col[i] == 1) ADDELEMENT(gi,i);
//
//    if (digraph)
//	writed6(outfile,g,m,n);
//    else
//        writes6(outfile,g,m,n);
//
//    for (i = 0, gi = g; i < n; ++i, gi += m)
//        if (col[i] == 1) DELELEMENT(gi,i);
//}

  /* Try one solution, accept if maximal. */
  /* Return value is level to return to. */
  private int trythisone(final GroupRecord group, final Graph g, final boolean digraph, final int n) {
    //int i, j;
    boolean accept;
    //Graph gi;
    //int ne;
    //char[] s = new char[20], p;
    //DYNALLSTAT(char,line,line_sz);

    newgroupsize = 1;

    System.out.println("SAI: groupsize " + groupsize + " lastrejok=" + (lastrejok ? "1" : "0"));
    if (group == null || Z.ONE.equals(groupsize)) {
      accept = true;
    } else if (lastrejok && !ismax(lastreject, n)) {
      accept = false;
    } else if (lastrejok && Z.TWO.equals(groupsize)) {
      accept = true;
    } else {
      newgroupsize = 1;
      first = true;
      System.out.println("SAI: calling allgroup");
      accept = NauGroup.allgroup2(group, testmax) == 0;
    }
    System.out.println("SAI: accept=" + (accept ? "1" : "0"));

    if (accept) {
//#ifdef GROUPTEST
//        if (groupsize % newgroupsize != 0)
//                    gt_abort("group size error\n");
//        totallab += groupsize/newgroupsize;
//#endif

      ++mGeneratedCount;
      if (mOutProc != null) {
        mOutProc.process(g, mColour);
      }
//
//	if (outfile != null)
//	    writeone(outfile,g,col,digraph,m,n);
//        else if (outfile)
//        {
//	    ne = 0;
//	    for (gi = g + m*(size_t)n; --gi >= g; )
//		ne += POPCOUNT(*gi);
//	    if (!digraph)
//	    {
//		for (i = 0, gi = g; i < n; ++i, gi += m)
//		    if (ISELEMENT(gi,i)) ++ne;
//	        ne /= 2;
//	    }
//#define PUTINT(xx) { unsigned long ul = (xx); char *sp; \
// if (ul == 0) *(p++) = '0'; \
// else { sp = s; while (ul) { *(sp++) = (ul % 10) + '0'; ul /= 10; } \
//        while (sp > s) { *(p++) = *(--sp); } }}
//#define SPC *(p++) = ' '
//
//	    DYNALLOC1(char,line,line_sz,20*(n+ne)+50,"vcolg output");
//	    p = line;
//            PUTINT(n); SPC; PUTINT(ne);
//            for (i = 0; i < n; ++i) { SPC; PUTINT(col[i]); }
//            SPC;
//            for (i = 0, gi = g; i < n; ++i, gi += m)
//            {
//                for (j = (digraph?-1:i-1); (j = nextelement(gi,m,j)) >= 0; )
//		{
//		    SPC; PUTINT(i); SPC; PUTINT(j);
//		}
//            }
//            *(p++) = '\n';
//            *(p++) = '\0';
//            fputs(line,outfile);
//#endif
//        }
      return n - 1;
    } else {
      return mFailLevel - 1;
    }
  }

  /* Recursive scan for default case */
  /* Returned value is level to return to. */
  private int scan(final int level, final Graph g, final boolean digraph, final int[] prev, final int mincols, final int maxcols, final int sofar, final GroupRecord group, int n) {
    System.out.println("SAI: scan: level=" + level + " sofar=" + sofar + " maxcols=" + maxcols);
    if (level == n) {
      return trythisone(group, g, digraph, n);
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
    System.out.println("SAI: min=" + min + " max=" + max + " counts=" + Arrays.toString(mColourCount));

    for (int k = min; k <= max; ++k) {
      if (mColourCount[k] <= 0) {
        continue;
      }
      if (mMinDeg[k] > g.degree(level) || mMaxDeg[k] < g.degree(level)) {
        continue;
      }
      --mColourCount[k];
      mColour[level] = k;
      System.out.println("SAI: Recurse with k=" + k);
      final int ret = scan(level + 1, g, digraph, prev, mincols, maxcols, sofar + k, group, n);
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
  private void setlabptn(final int[] weight, final int[] lab, final int[] ptn, final int n) {
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
          int k;
          for (k = 0; k < n; ++k) {
            if (g.isAdjacent(i, k) != g.isAdjacent(j, k)) {
              break;
            }
          }
          if (k < n) {
            flip(g, i, j);
//            FLIPELEMENT(gi, i);
//            FLIPELEMENT(gj, j);
            for (k = 0; k < n; ++k) {
              if (g.isAdjacent(i, k) != g.isAdjacent(j, k)) {
                break;
              }
            }
            flip(g, i, j);
//            FLIPELEMENT(gi, i);
//            FLIPELEMENT(gj, j);
          }
          if (k == n) {
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
      scan(0, g, false, prev, mMinColours, mMaxColours, 0, null, n);
      return;
    }

    for (int i = nfixed; i < n; ++i) {
      weight[i] += nfixed;
    }

    System.out.println("SAI: weights " + Arrays.toString(weight));

    int maxcols = mMaxColours;
    if (maxcols == Multigraph.NOLIMIT || maxcols > n * mNumColours) {
      maxcols = n * mNumColours;
    }
    if (n * mNumColours < mMinColours) {
      return;
    }

    final NauGroup ng = new NauGroup();
    options.mUserAutomProc = ng; //groupautomproc;
    options.mUserLevelProc = ng; //grouplevelproc;
    options.mDefaultPtn = false;
    options.mDigraph = (nloops > 0);
    //options.setCanon(1);


    setlabptn(weight, lab, ptn, n);

    if (nloops > 0) {
      for (int i = 0; i < n; ++i) {
        if (loop[i]) {
          g.addEdge(i, i);
        }
      }
    }

    System.out.println("SAI: ptn " + Arrays.toString(ptn));
    final int[] orbits = new int[g.order()];
    try {
      new Nauty(g, lab, ptn, null, orbits, options, stats, workspace);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }

//    orbits[0] = 1;
//    orbits[1] = 0;
//    orbits[2] = 1;
//    orbits[3] = 0;
//    stats.mNumOrbits = 4;
    System.out.println("SAI: orbits " + Arrays.toString(orbits));
    System.out.println("SAI: numOrbits=" + stats.mNumOrbits);

    groupsize = stats.mGrpSize;
//    if (stats.grpsize2 == 0)
//      groupsize = stats.grpsize1 + 0.1;
//    else
//      groupsize = 0;

    GroupRecord group = ng.groupPtr(false); //groupptr(false);
    ng.makeCosetReps(group);  // makecosetreps(group);

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

    System.out.println("SAI: orbits " + Arrays.toString(orbits));
    System.out.println("SAI: prev " + Arrays.toString(prev));

    lastrejok = false;
    Arrays.fill(mColour, 0, n, 0);
    scan(0, g, false, prev, mMinColours, maxcols, 0, group, n);
  }

// static void
// colourdigraph(graph *g, int nfixed, long mincols, long maxcols,
//          long *colcount, long *mindeg, long *maxdeg, long *deg,
//          long numcols, int m, int n)
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
// 	{
// 	    DELELEMENT(gi,i);
// 	    loop[i] = true;
// 	    ++nloops;
// 	}
// 	else
// 	    loop[i] = false;

//     for (ii = 0; ii < m*(size_t)n; ++ii) gconv[ii] = g[ii];
//     converse(gconv,m,n);

//     for (region = 0; region < 2; ++region)
//     {
// 	if (region == 0)
// 	{
// 	    if (nfixed == 0) continue;
// 	    start = 0;
// 	    stop = nfixed;
// 	    if (stop > n) stop = n;
// 	}
// 	else
// 	{
// 	    if (nfixed >= n) continue;
// 	    start = nfixed;
// 	    stop = n;
// 	}
	
// 	for (i = start,
//                     gi = g + m*(size_t)start, gci = gconv + m*(size_t)start;
//              i < stop; ++i, gi += m, gci += m)
// 	{
//             /* Find most recent equivalent j. */
// 	    for (j = i-1, gj = gi-m, gcj = gci-m; j >= start;
//                                                    --j, gj -= m, gcj -= m)
// 	    {
// 		if (loop[j] != loop[i]
//                        || ISELEMENT(gi,j) != ISELEMENT(gj,i)) continue;
// 		for (k = 0; k < m; ++k)
//                      if (gi[k] != gj[k] || gci[k] != gcj[k]) break;
// 		if (k < m)
// 		{
// 		    FLIPELEMENT(gi,i); FLIPELEMENT(gj,j);
// 		    FLIPELEMENT(gci,i); FLIPELEMENT(gcj,j);
// 		    for (k = 0; k < m; ++k)
//                         if (gi[k] != gj[k] || gci[k] != gcj[k]) break;
// 		    FLIPELEMENT(gci,i); FLIPELEMENT(gcj,j);
// 		    FLIPELEMENT(gi,i); FLIPELEMENT(gj,j);
// 		}
// 		if (k == m) break;
// 	    }
// 	    if (j >= start)
// 	    {
// 		prev[i] = j;
// 		weight[i] = weight[j] + 1;
// 	    }
// 	    else
// 	    {
// 		prev[i] = -1;
// 		weight[i] = 0;
// 	    }
// 	}
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
// 	    if (loop[i]) ADDELEMENT(gi,i);
 
//     nauty(g,lab,ptn,null,orbits,&options,&stats,workspace,2*MAXNV,m,n,null);

//     if (stats.grpsize2 == 0)
//         groupsize = stats.grpsize1 + 0.1;
//     else
//         groupsize = 0;

//     group = groupptr(false);
//     makecosetreps(group);

//     if (stats.numorbits < n)
//     {
// 	j = n;
// 	for (i = 0; i < n; ++i)
// 	    if (orbits[i] < i && orbits[i] < j) j = orbits[i];

// 	for (i = j + 1; i < n; ++i)
// 	    if (orbits[i] == j) prev[i] = j;
//     }

//     lastrejok = false;
//     for (i = 0; i < n; ++i) col[i] = 0;

//     scan(0,g,true,prev,mincols,maxcols,0,colcount,
//                                 mindeg,maxdeg,deg,numcols,group,m,n);
// }

// int
// main(int argc, char *argv[])
// {
//     graph *g,*gi;
//     int m,n,codetype;
//     int argnum,i,j,nfixed;
//     char *arg,sw;
//     boolean badargs,digraph,cswitch,dswitch,Dswitch;
//     boolean fswitch,uswitch,eswitch,qswitch,mswitch;
//     long mincols,maxcols,numcols,totcols;
//     double t;
//     char *infilename,*outfilename;
//     FILE *infile;
//     char msg[201];
//     int msglen,collen,dlen,Dlen;
//     long colcount[MAXNV],mindeg[MAXNV],maxdeg[MAXNV],deg[MAXNV];

//     HELP; PUTVERSION;

//     nauty_check(WORDSIZE,1,1,NAUTYVERSIONID);

//     fswitch = Tswitch = oswitch = cswitch = dswitch = false;
//     uswitch = eswitch = mswitch = qswitch = Dswitch = false;
//     infilename = outfilename = null;

//     argnum = 0;
//     badargs = false;
//     for (j = 1; !badargs && j < argc; ++j)
//     {
//         arg = argv[j];
//         if (arg[0] == '-' && arg[1] != '\0')
//         {
//             ++arg;
//             while (*arg != '\0')
//             {
//                 sw = *arg++;
//                      SWLONG('m',mswitch,numcols,"vcolg -m")
//                 else SWBOOLEAN('q',qswitch)
//                 else SWBOOLEAN('u',uswitch)
//                 else SWBOOLEAN('T',Tswitch)
//                 else SWBOOLEAN('o',oswitch)
// 		else SWSEQUENCEMIN('c',",",cswitch,colcount,1,MAXNV,collen,"vcolg -c")
// 		else SWSEQUENCEMIN('d',",",dswitch,mindeg,1,MAXNV,dlen,"vcolg -d")
// 		else SWSEQUENCEMIN('D',",",Dswitch,maxdeg,1,MAXNV,Dlen,"vcolg -D")
//                 else SWINT('f',fswitch,nfixed,"vcolg -f")
//                 else SWRANGE('e',":-",eswitch,mincols,maxcols,"vcolg -e")
//                 else badargs = true;
//             }
//         }
//         else
//         {
//             ++argnum;
//             if      (argnum == 1) infilename = arg;
//             else if (argnum == 2) outfilename = arg;
//             else                  badargs = true;
//         }
//     }

//     if (badargs || argnum > 2)
//     {
//         fprintf(stderr,">E Usage: %s\n",USAGE);
//         GETHELP;
//         exit(1);
//     }

//     if ((Tswitch!=0) + (oswitch!=0) + (uswitch!=0) >= 2)
//         gt_abort(">E vcolg: -T, -o and -u are incompatible\n");

// #ifndef OUTPROC
//     if (!Tswitch && !oswitch && !uswitch)
//         gt_abort(">E vcolg: must use -T, -o or -u\n");
// #endif

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
// 	gt_abort(">E vcolg: -m and -c disagree on number of colours\n");

//     if (cswitch)
//     {
// 	numcols = collen;
// 	totcols = 0;
// 	for (i = 0; i < numcols; ++i)
// 	    if (colcount[i] < 0)
// 		gt_abort(">E vcolg: negative counts not allowed for -c\n");
// 	    else
// 	    {
// 		totcols += colcount[i];
// 		if (totcols < 0) { totcols = NOLIMIT; break; } /* catch overflow */
// 	    }
//     }
//     else
// 	for (i = 0; i < numcols; ++i) colcount[i] = NOLIMIT;

//     if (dswitch && dlen > numcols)
//         gt_abort(">E vcolg: -d has too many colours\n");
//     if (Dswitch && Dlen > numcols)
// 	gt_abort(">E vcolg: -D has too many colours\n");

//     for (i = (dswitch ? dlen : 0); i < numcols; ++i)
// 	mindeg[i] = 0;
//     for (i = (Dswitch ? Dlen : 0); i < numcols; ++i)
// 	maxdeg[i] = NOLIMIT;
//     for (i = 0; i < numcols; ++i)
// 	if (mindeg[i] > maxdeg[i])
// 	    gt_abort(">E vcolg : contradictory bound from -d/-D\n");

//     if (cswitch && !qswitch)
//     { 
//         fprintf(stderr,">c"); for (i = 0; i < numcols; ++i)
// 	    fprintf(stderr," %ld",colcount[i]);
//         fprintf(stderr,"\n");
//     }

//     if (dswitch && !qswitch)
//     { 
//         fprintf(stderr,">d");
//         for (i = 0; i < numcols; ++i)
// 	    fprintf(stderr," %ld",mindeg[i]);
//         fprintf(stderr,"\n");
//     }

//     if (Dswitch && !qswitch)
//     { 
//         fprintf(stderr,">D");
       
//         for (i = 0; i < numcols; ++i)
// 	    if (maxdeg[i] == NOLIMIT) fprintf(stderr," -");
// 	    else                      fprintf(stderr," %ld",maxdeg[i]);
//         fprintf(stderr,"\n");
//     }

//     if (!qswitch)
//     {
//         msg[0] = '\0';
//         CATMSG0(">A vcolg");
//         if (eswitch || mswitch || uswitch || (fswitch && nfixed > 0)
//               || Tswitch || oswitch)
//             CATMSG0(" -");
//         if (mswitch) CATMSG1("m%ld",numcols);
//         if (uswitch) CATMSG0("u");
//         if (Tswitch) CATMSG0("T");
//         if (oswitch) CATMSG0("o");
//         if (fswitch) CATMSG1("f%d",nfixed);
//         if (eswitch) CATMSG2("e%ld:%ld",mincols,maxcols);
//         msglen = strlen(msg);
//         if (argnum > 0) msglen += strlen(infilename);
//         if (argnum > 1) msglen += strlen(outfilename);
//         if (msglen >= 196)
//         {
//             fputs(msg,stderr);
//             if (argnum > 0) fprintf(stderr," %s",infilename);
//             if (argnum > 1) fprintf(stderr," %s",outfilename);
//             fprintf(stderr,"\n");
//         }
//         else
//         {
//             if (argnum > 0) CATMSG1(" %s",infilename);
//             if (argnum > 1) CATMSG1(" %s",outfilename);
//             CATMSG0("\n");
//             fputs(msg,stderr);
//         }
//         fflush(stderr);
//     }

//     if (infilename && infilename[0] == '-') infilename = null;
//     infile = opengraphfile(infilename,&codetype,false,1);
//     if (!infile) exit(1);
//     if (!infilename) infilename = "stdin";

//     if (uswitch)
//         outfile = null;
//     else
//     {
//         if (!outfilename || outfilename[0] == '-')
//         {
//             outfilename = "stdout";
//             outfile = stdout;
//         }
//         else if ((outfile = fopen(outfilename,"w")) == null)
//         {
//             fprintf(stderr,"Can't open output file %s\n",outfilename);
//             gt_abort(null);
//         }
//     }

//     vc_nin = vc_nout = 0;

//     t = CPUTIME;
//     while (true)
//     {
//         if ((g = readgg(infile,null,0,&m,&n,&digraph)) == null) break;
//         ++vc_nin;

// 	if (cswitch && n > totcols)
// 	    gt_abort(">E vcolg: not enough colours for input\n");

//         if (oswitch && loopcount(g,m,n) > 0)
//             gt_abort(">E vcolg: loops in input are not allowed for -o\n");

// 	for (i = 0, gi = g; i < n; ++i, gi += m)
// 	{
// 	    deg[i] = 0;
// 	    for (j = 0; j < m; ++j) deg[i] += POPCOUNT(gi[j]);
// 	}

// 	if (!digraph)
//             colourgraph(g,nfixed,mincols,maxcols,colcount,
//                                    mindeg,maxdeg,deg,numcols,m,n);
// 	else
// 	    colourdigraph(g,nfixed,mincols,maxcols,colcount,
//                                    mindeg,maxdeg,deg,numcols,m,n);

// 	if (!uswitch && ferror(outfile)) gt_abort(">E vcolg output error\n");
//         FREES(g);
//     }
//     t = CPUTIME - t;

// #ifdef SUMMARY
//     SUMMARY();
// #endif

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

// #ifdef GROUPTEST
//     fprintf(stderr,"Group test = %lld\n",totallab);
// #endif

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
    mColourCount = colourCount;
    mMinDeg = minDeg;
    mMaxDeg = maxDeg;
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

}
