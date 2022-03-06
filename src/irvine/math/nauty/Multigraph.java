package irvine.math.nauty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.Graph6;
import irvine.util.CliFlags;

/**
 * Generate multigraphs.
 * @author B. D. McKay (<code>multig.c version 1.6; B D McKay, Aug 31, 2011</code>)
 * @author Sean A. Irvine (minimal Java port)
 */
public class Multigraph implements GroupAction {

/*
 multig [-q] [-u|-T|-G|-A|-B] [-e#|-e#:#]
       [-m#] [-f#] [-D#|-r#|-l#] [infile [mOut]]

  Read undirected loop-free graphs and replace their edges with multiple
  edges in all possible ways (multiplicity at least 1).
  Isomorphic multigraphs derived from the same input are suppressed.
  If the input graphs are non-isomorphic then the output graphs are also.
    -e# | -e#:#  specify a value or range of the total number of edges
                 counting multiplicities
    -m# maximum edge multiplicity (minimum is 1)
    -D# upper bound on maximum degree
    -r# make regular of specified degree (incompatible with -l, -D, -e)
    -l# make regular multigraphs with multiloops, degree #
                 (incompatible with -r, -D, -e)
    Either -l, -r, -D, -e or -m with a finite maximum must be given
    -f# Use the group that fixes the first # vertices setwise
    -T  use a simple text output format (nv ne {mV1 v2 mult})
    -G  like -T but includes group size as third item (if less than 10^10)
          The group size does not include exchange of isolated vertices.
    -A  write as the upper triangle of an adjacency matrix, row by row, 
        including the diagonal, and preceded by the number of vertices
    -B  write as an integer matrix preceded by the number of rows and
        number of columns, where -f determines the number of rows
    -u  no output, just count them
    -q  suppress auxiliary information
*/

  protected static final int MAXNV = 128;
  protected static final int MAXNE = 1024;
  static final String TEXT_FLAG = "text";
  private static final String REGULAR_FLAG = "regular";
  private static final String LOOP_FLAG = "loop";
  static final String FIX_FLAG = "fix";
  private static final String ADJACENCY_FLAG = "adjacency";
  private static final String MATRIX_FLAG = "matrix";
  static final String GROUP_SIZE_FLAG = "group";

  private long mGraphsRead = 0;
  protected long mGraphsOutput = 0;
  private final PrintStream mOut;
  private final boolean mTextOutput;

  protected final int[] mV0 = new int[MAXNE + MAXNV];
  protected final int[] mV1 = new int[MAXNE + MAXNV];
  protected final int[][] mEdgeNo = new int[MAXNV][MAXNV];
  protected final int[] mLastLevel = new int[MAXNE];
  private final int[] mIx = new int[MAXNE + MAXNV];
  private int mNix;

  private boolean mFirst;
  private final int[] mLastReject = new int[MAXNV];
  protected boolean mLastRejectOk;
  protected long mGroupSize;
  private long mNewGroupSize;
  static boolean sGSwitch;
  private final boolean mAjacencyOutput;
  private final boolean mMatrixOutput;

  protected MultigraphProcessor mOutProc = null;

  /**
   * Construct a new multigraph processor.
   * @param out output stream (may be null)
   * @param textOutput true to select text output of graphs
   * @param adjacencyOutput true if adjacency output required
   * @param matrixOutput true if matrix output is required
   */
  public Multigraph(final PrintStream out, final boolean textOutput, final boolean adjacencyOutput, final boolean matrixOutput) {
    mOut = out;
    mTextOutput = textOutput;
    mAjacencyOutput = adjacencyOutput;
    mMatrixOutput = matrixOutput;
  }

  /**
   * Set the output processor.
   * @param outProc output processor
   */
  public void setProcessor(final MultigraphProcessor outProc) {
    mOutProc = outProc;
  }

  protected void summary() {
  }

  /* test if x^p <= x */
  boolean isMax(final int[] p, final int pos, final int n) {
    for (int i = 0; i < mNix; ++i) {
      final int k = mEdgeNo[p[pos + mV1[i]]][p[pos + mV0[i]]];
      if (mIx[k] > mIx[i]) {
        return false;
      } else if (mIx[k] < mIx[i]) {
        return true;
      }
    }
    ++mNewGroupSize;
    return true;
  }

  @Override
  public void groupAction(final int[] p, final int pos, final int n, final int[] abort) {
    if (mFirst) {
      // only the identity
      mFirst = false;
      return;
    }

    if (!isMax(p, pos, n)) {
      abort[0] = 1;
      System.arraycopy(p, pos, mLastReject, 0, n);
      mLastRejectOk = true;
    }
  }

  /* Write adjacency matrix formats */
  void printAdjacencyMatrix(final PrintStream f, final int n, final int ne, final int[] ix) {
    throw new UnsupportedOperationException();
    /*
    int i, j;
    if (mAjacencyOutput) {
        fprintf(f, "%d ", n);
        for (i = 0; i < n; ++i)
            for (j = i; j < n; ++j)
                fprintf(f, " %d", (mEdgeNo[i][j]>=0 ? mIx[mEdgeNo[i][j]]: 0));
        fprintf(f, "\n");
    } else  {
        if (mBrows <= 0 || mBrows > n)
        {
            fprintf(stderr, ">E multig: impossible matrix size for output\n");
            exit(1);
        }
        fprintf(f, "%d %d", mBrows, n-mBrows);

        for (i = 0; i < mBrows; ++i)
        {
            fprintf(f, " ");
            for (j = mBrows; j < n; ++j)
                fprintf(f, " %d", (mEdgeNo[i][j]>=0 ? mIx[mEdgeNo[i][j]]: 0));
        }
        fprintf(f, "\n");
    }
    */
  }


  /* Try one solution, getCount if minimal. */
  protected void tryThisOne(final GroupRecord group, final boolean lswitch, final int[] deg, final int maxdeg, final int ne, final int n) {
    final boolean accept;
    mNix = ne;
    mNewGroupSize = 1;
    if (group == null || mGroupSize == 1) {
      accept = true;
    } else if (mLastRejectOk && !isMax(mLastReject, 0, n)) {
      accept = false;
    } else if (mLastRejectOk && mGroupSize == 2) {
      accept = true;
    } else {
      mNewGroupSize = 1;
      mFirst = true;
      accept = NauGroup.allgroup2(group, this) == 0;
    }
    if (accept) {
      ++mGraphsOutput;

      if (mOutProc != null || mOut != null) {
        int ne2 = ne;
        if (lswitch) {
          for (int i = 0; i < n; ++i) {
            if (deg[i] < maxdeg) {
              mV0[ne2] = i;
              mV1[ne2] = i;
              mIx[ne2] = (maxdeg - deg[i]) / 2;
              ++ne2;
            }
          }
        }
        if (mOutProc != null) {
          mOutProc.process(n, ne, deg);
        }
        if (mOut != null) {
          if (mAjacencyOutput || mMatrixOutput) {
            printAdjacencyMatrix(mOut, n, ne2, mIx);
          } else {
            final StringBuilder sb = new StringBuilder();
            sb.append(n).append(' ').append(ne2);
            if (sGSwitch) {
              sb.append(' ').append(mNewGroupSize);
            }
            for (int i = 0; i < ne2; ++i) {
              sb.append(' ').append(mV0[i]).append(' ').append(mV1[i]).append(' ').append(mIx[i]);
            }
            mOut.println(sb);
          }
        }
      }
    }
  }

  /* Recursive scan for default case */
  protected void scan(final int level, final int ne, final int minedges, final int maxedges, final int sofar, final int maxmult, final GroupRecord group, final int n) {
    if (level == ne) {
      tryThisOne(group, false, null, 0, ne, n);
      return;
    }
    final int left = ne - level - 1;
    int min = minedges - sofar - maxmult * left;
    if (min < 1) {
      min = 1;
    }
    int max = maxedges - sofar - left;
    if (max > maxmult) {
      max = maxmult;
    }
    for (int k = min; k <= max; ++k) {
      mIx[level] = k;
      scan(level + 1, ne, minedges, maxedges, sofar + k, maxmult, group, n);
    }
  }

  /* Recursive scan, maxDeg version */
  protected void scanMaxDeg(final int level, final int ne, final int minedges, final int maxedges, final int sofar,
                          final int maxmult, final GroupRecord group, final int n, final int[] deg, final int maxdeg) {
    if (level == ne) {
      tryThisOne(group, false, deg, maxdeg, ne, n);
      return;
    }

    final int x1 = mV0[level];
    final int x2 = mV1[level];
    final int left = ne - level - 1;
    int min = minedges - sofar - maxmult * left;
    if (min < 1) {
      min = 1;
    }
    int max = maxedges - sofar - left;
    if (max > maxmult) {
      max = maxmult;
    }
    if (deg[x1] + max - 1 > maxdeg) {
      max = maxdeg - deg[x1] + 1;
    }
    if (deg[x2] + max - 1 > maxdeg) {
      max = maxdeg - deg[x2] + 1;
    }

    for (int k = min; k <= max; ++k) {
      mIx[level] = k;
      deg[x1] += k - 1;
      deg[x2] += k - 1;
      scanMaxDeg(level + 1, ne, minedges, maxedges, sofar + k, maxmult, group, n, deg, maxdeg);
      deg[x1] -= k - 1;
      deg[x2] -= k - 1;
    }
  }

  /* Recursive scan, regular-with-loops version. */
  protected void scanLoops(final int level, final int ne, final int minEdges, final int maxEdges, final int soFar,
                         final int maxMult, final GroupRecord group, final int n, final int[] deg, final int maxDeg) {
    if (level == ne) {
      tryThisOne(group, true, deg, maxDeg, ne, n);
      return;
    }

    final int x1 = mV0[level];
    final int x2 = mV1[level];
    final int left = ne - level - 1;
    int min = minEdges - soFar - maxMult * left;
    if (min < 1) {
      min = 1;
    }
    int max = maxEdges - soFar - left;
    if (max > maxMult) {
      max = maxMult;
    }
    if (deg[x1] + max - 1 > maxDeg) {
      max = maxDeg - deg[x1] + 1;
    }
    if (deg[x2] + max - 1 > maxDeg) {
      max = maxDeg - deg[x2] + 1;
    }
    boolean odd = false;
    boolean even = false;
    if (mLastLevel[x1] == level) {
      if (((maxDeg - deg[x1]) & 1) == 1) {
        even = true;
      } else {
        odd = true;
      }
    }
    if (mLastLevel[x2] == level) {
      if (((maxDeg - deg[x2]) & 1) == 1) {
        even = true;
      } else {
        odd = true;
      }
    }
    if (even && odd) {
      return;
    }

    for (int k = min; k <= max; ++k) {
      if (even && (k & 1) == 1) {
        continue;
      }
      if (odd && (k & 1) == 0) {
        continue;
      }

      mIx[level] = k;
      deg[x1] += k - 1;
      deg[x2] += k - 1;
      scanLoops(level + 1, ne, minEdges, maxEdges, soFar + k, maxMult, group, n, deg, maxDeg);
      deg[x1] -= k - 1;
      deg[x2] -= k - 1;
    }
  }


  /* Recursive scan, regular version. */
  protected void scanRegular(final int level, final int ne, final int minedges, final int maxedges, final int sofar,
                           final int maxmult, final GroupRecord group, final int n, final int[] delta, final int[] def, final int maxdeg) {
    if (level == ne) {
      tryThisOne(group, false, null, maxdeg, ne, n);
      return;
    }

    final int x1 = mV0[level];
    final int x2 = mV1[level];
    final int left = ne - level - 1;
    int min = minedges - sofar - maxmult * left;
    if (min < 1) {
      min = 1;
    }
    int max = maxedges - sofar - left;
    if (max > maxmult) {
      max = maxmult;
    }
    if (max > def[x1] + 1) {
      max = def[x1] + 1;
    }
    if (max > def[x2] + 1) {
      max = def[x2] + 1;
    }

    if (min < def[x2] + 1 - delta[x1]) {
      min = def[x2] + 1 - delta[x1];
    }
    if (min < def[x1] + 1 - delta[x2]) {
      min = def[x1] + 1 - delta[x2];
    }

    if (mLastLevel[x1] == level && min < def[x1] + 1) {
      min = def[x1] + 1;
    }
    if (mLastLevel[x2] == level && min < def[x2] + 1) {
      min = def[x2] + 1;
    }

    for (int k = min; k <= max; ++k) {
      mIx[level] = k;
      delta[x1] += k - 1 - def[x2];
      delta[x2] += k - 1 - def[x1];
      def[x1] -= k - 1;
      def[x2] -= k - 1;
      scanRegular(level + 1, ne, minedges, maxedges, sofar + k, maxmult, group, n, delta, def, maxdeg);
      def[x1] += k - 1;
      def[x2] += k - 1;
      delta[x1] -= k - 1 - def[x2];
      delta[x2] -= k - 1 - def[x1];
    }
  }

  private static final int WORDSIZE = 64;
  /** No limit on the number of edges. */
  public static final int NOLIMIT = 2000000031;

  /**
   * Generate all the multigraphs of a graph
   * @param g the graph
   * @param nFixed number of fixed points
   * @param minEdges minimum number of edges
   * @param maxEdges maximum number of edges
   * @param maxMult maximum edge multiplicity
   * @param maxDegree maximum degree of each vertex
   * @param lSwitch generate loops
   * @throws IOException if an I/O error occurs
   */
  public void multi(final Graph g, final int nFixed, final int minEdges, int maxEdges, int maxMult, final int maxDegree, final boolean lSwitch) throws IOException {
    ++mGraphsRead;
    final int n = g.order();
    final int[] lab = new int[n];
    final int[] deg = new int[n];
    int j0 = -1;  // last vertex with degree 0
    int j1 = n;   // first vertex with degree > 0
    int ne = 0;
    int maxD = 0;
    for (int i = 0; i < n; ++i) {
      final int thisDegree = (int) g.degree(i);
      deg[i] = thisDegree;
      if (thisDegree > maxD) {
        maxD = thisDegree;
      }
      if (thisDegree == 0) {
        lab[++j0] = i;
      } else {
        lab[--j1] = i;
      }
      ne += thisDegree;
    }
    ne /= 2;
    if (maxDegree >= 0 && maxD > maxDegree) {
      return;
    }
    if (mAjacencyOutput || mMatrixOutput) {
      resetEdgeNumbering(n);
    }
    if (ne == 0 && minEdges <= 0 && (!lSwitch || (maxDegree & 1) == 0)) {
      tryThisOne(null, lSwitch, deg, maxDegree, 0, n);
      return;
    }
    int k = 0;
    for (int i = 0, gip = 0; i < n; ++i, ++gip) {
      for (int j = i; (j = g.nextVertex(gip, j)) >= 0; ) {
        mV0[k] = i;
        mV1[k] = j;
        mEdgeNo[i][j] = mEdgeNo[j][i] = k;
        mLastLevel[i] = mLastLevel[j] = k;
        ++k;
      }
    }
    final boolean isreg = !lSwitch && (maxDegree >= 0 && 2 * minEdges == n * maxDegree);
    final int[] delta = new int[n];
    final int[] def = new int[n];
    if (isreg) { // regular case, Condition: def(v) <= total def of neighbours
      for (int i = 0; i < n; ++i) {
        def[i] = maxDegree - deg[i];
        delta[i] = -def[i];
      }
      for (int i = 0; i < k; ++i) {
        final int x0 = mV0[i];
        final int x1 = mV1[i];
        delta[x0] += def[x1];
        delta[x1] += def[x0];
      }
      for (int i = 0; i < n; ++i) {
        if (delta[i] < 0) {
          return;
        }
      }
    }
    if (((isreg || lSwitch) && (maxDegree & n & 1) == 1)
      || (isreg && j0 >= 0 && maxDegree > 0)
      || (lSwitch && j0 >= 0 && (maxDegree & 1) == 1)) {
      return;
    }
    if (maxEdges == NOLIMIT) {
      if (maxMult == NOLIMIT) {
        maxEdges = maxDegree * n / 2;
      } else {
        maxEdges = ne * maxMult;
      }
    }
    if (maxMult == NOLIMIT) {
      maxMult = maxEdges - ne + 1;
    }
    if (maxDegree >= 0 && maxMult > maxDegree) {
      maxMult = maxDegree;
    }
    if (maxEdges < ne || ne * maxMult < minEdges) {
      return;
    }
    if (n > MAXNV || ne > MAXNE) {
      throw new IllegalArgumentException(">E multig: MAXNV or MAXNE exceeded");
    }
    final int[] ptn = new int[n];
    Arrays.fill(ptn, 1);
    ptn[n - 1] = 0;
    final NautySet active = new NautySet((n + WORDSIZE - 1) / WORDSIZE);
    if (j0 != n - 1) {
      active.set(j0 + 1);
    }
    Arrays.fill(ptn, 0, j0 + 1, 0);
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
    final NauGroup ng = new NauGroup();
    final OptionBlk options = new OptionBlk();
    options.mDefaultPtn = false;
    options.mUserAutomProc = ng;
    options.mUserLevelProc = ng;
    final StatsBlk stats = new StatsBlk();
    new Nauty(g, lab, ptn, active, new int[n], options, stats, new long[100]);
    mGroupSize = stats.groupSize().longValueExact();
    final GroupRecord group = ng.groupPtr(false);
    ng.makeCosetReps(group);
    mLastRejectOk = false;
    if (isreg) {
      scanRegular(0, ne, minEdges, maxEdges, 0, maxMult, group, n, delta, def, maxDegree);
    } else if (lSwitch) {
      scanLoops(0, ne, minEdges, maxEdges, 0, maxMult, group, n, deg, maxDegree);
    } else if (maxDegree >= 0) {
      scanMaxDeg(0, ne, minEdges, maxEdges, 0, maxMult, group, n, deg, maxDegree);
    } else {
      scan(0, ne, minEdges, maxEdges, 0, maxMult, group, n);
    }
  }

  private void resetEdgeNumbering(final int n) {
    for (int i = 0; i < n; ++i) {
      Arrays.fill(mEdgeNo[i], 0, n, -1);
    }
  }

  /**
   * Get the count of the number of graphs.
   * @return graph count
   */
  public long getGraphsOutputCount() {
    return mGraphsOutput;
  }

  /**
   * The total number of input graphs processed with this instance
   * @return number of input graphs
   */
  public long getGraphsInputCount() {
    return mGraphsRead;
  }

  private static CliFlags initFlags() {
    final CliFlags flags = new CliFlags("Multigraph", "Generate all multigraphs of a graph with given constraints.");
    flags.registerOptional('u', GenerateGraphsCli.NO_OUTPUT_FLAG, "do not output generated graphs, just count them");
    flags.registerOptional('D', GenerateGraphsCli.MAX_DEGREE_FLAG, Integer.class, "INTEGER", "upper bound for the maximum degree", 1);
    flags.registerOptional('M', GenerateGraphsCli.MAX_EDGES_FLAG, Integer.class, "INTEGER", "maximum edge multiplicity (minimum 1)", NOLIMIT);
    flags.registerOptional('T', TEXT_FLAG, "use a simple text output format (nv ne {mV1 v2 mult})");
    flags.registerOptional('G', GROUP_SIZE_FLAG, "like -T but includes group size as third item (if less than 10^10). The group size does not include exchange of isolated vertices.");
    flags.registerOptional('A', ADJACENCY_FLAG, "write as the upper triangle of an adjacency matrix, row by row, including the diagonal, and preceded by the number of vertice");
    flags.registerOptional('r', REGULAR_FLAG, Integer.class, "INTEGER", "make regular of specified degree (incompatible with -l, -D, -e)");
    flags.registerOptional('l', LOOP_FLAG, Integer.class, "INTEGER", "make regular multigraphs with multiloops (incompatible with -r, -D, -e)");
    flags.registerOptional('f', FIX_FLAG, Integer.class, "INTEGER", "use the group that fixes the first n vertices setwise");
    flags.registerOptional('q', GenerateGraphsCli.QUIET_FLAG, "produce less output");
    flags.registerOptional('e', DirectedGraph.EDGES_FLAG, String.class, "min[:max]", "specify a value or range of the total number of arcs");
    return flags;
  }

  /**
   * Main program for generating multigraphs.
   * @param args see usage clues above
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = initFlags();
    flags.setFlags(args);

    int maxDegree = (Integer) flags.getValue(GenerateGraphsCli.MAX_DEGREE_FLAG);
    final int maxMultiplicity = (Integer) flags.getValue(GenerateGraphsCli.MAX_EDGES_FLAG);

    final boolean fswitch = flags.isSet(FIX_FLAG);
    final int nFixed = fswitch ? (Integer) flags.getValue(FIX_FLAG) : 0;
    final boolean uSwitch = flags.isSet(GenerateGraphsCli.NO_OUTPUT_FLAG);
    final boolean eSwitch = flags.isSet(DirectedGraph.EDGES_FLAG);
    final boolean lSwitch = flags.isSet(LOOP_FLAG);
    final boolean rSwitch = flags.isSet(REGULAR_FLAG);
    final int regularDegree = rSwitch ? (Integer) flags.getValue(REGULAR_FLAG) : 0;
    final int ldeg = lSwitch ? (Integer) flags.getValue(LOOP_FLAG) : 0;

    boolean dSwitch = flags.isSet(GenerateGraphsCli.MAX_DEGREE_FLAG);
    if (rSwitch && (dSwitch || eSwitch)) {
      throw new IllegalArgumentException(">E multig: -r is incompatible with -D and -e");
    }
    if (lSwitch && (rSwitch || dSwitch || eSwitch)) {
      throw new IllegalArgumentException(">E multig: -l is incompatible with -r, -D and -e");
    }

    int minEdges;
    int maxEdges;
    if (eSwitch) {
      final String v = (String) flags.getValue(DirectedGraph.EDGES_FLAG);
      final int colon = v.indexOf(':');
      if (colon == -1 || colon == v.length() - 1) {
        minEdges = Integer.parseInt(v);
        maxEdges = minEdges;
      } else if (colon == 0) {
        minEdges = 0;
        maxEdges = Integer.parseInt(v.substring(colon + 1));
      } else {
        minEdges = Integer.parseInt(v.substring(0, colon));
        maxEdges = Integer.parseInt(v.substring(colon + 1));
      }
    } else {
      minEdges = 0;
      maxEdges = NOLIMIT;
    }

    double t;
    sGSwitch = flags.isSet(GROUP_SIZE_FLAG);

    final Multigraph mg = new Multigraph(uSwitch ? null : System.out, flags.isSet(TEXT_FLAG), flags.isSet(ADJACENCY_FLAG), flags.isSet(MATRIX_FLAG));
//    if ((sGSwitch!=0) + (mTextOutput!=0) + (uSwitch!=0)
//      + (adjSwitch!=0) + (mMatrixOutput!=0) >= 2) {
//      throw new IllegalArgumentException(">E multig: -G, -T, -A, -B and -u are incompatible");
//    }

    if (mg.mOutProc == null) {
      if (!mg.mTextOutput && !sGSwitch && !mg.mAjacencyOutput && !mg.mMatrixOutput && !uSwitch && !sGSwitch) {
        throw new IllegalArgumentException(">E multig: must use -A, -B, -T, -G or -u");
      }
    }

    if (mg.mMatrixOutput && nFixed == 0) {
      throw new IllegalArgumentException(">E multig: -B requires -f# with #>0");
    }
//    if (fswitch) {
//      int mBrows = nFixed;
//    }
//
    if (maxEdges >= NOLIMIT && maxMultiplicity >= NOLIMIT && !dSwitch && !rSwitch && !lSwitch) {
      throw new IllegalArgumentException(">E multig: either -D or -e or -m or -r must impose a real limit");
    }

    if (rSwitch) {
      dSwitch = true;
      maxDegree = regularDegree;
    }

    if (lSwitch) {
      dSwitch = true;
      maxDegree = ldeg;
    }

    t = System.currentTimeMillis();
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        final Graph g = Graph6.toGraph(line);
        final int n = g.order();
        if (rSwitch) {
          minEdges = (n * regularDegree + 1) / 2;
          maxEdges = (n * regularDegree) / 2;
        }
        if (lSwitch) {
          maxEdges = (n * ldeg) / 2;
          if ((ldeg & 1) == 1) {
            minEdges = (n + 1) / 2;
          } else {
            minEdges = 0;
          }
        }
        final int md = dSwitch ? maxDegree : -1;
        //System.err.println(nFixed + ", " + minEdges + ", " + maxEdges + ", " + maxMultiplicity + ", " + md + ", " + lSwitch);
        mg.multi(g, nFixed, minEdges, maxEdges, maxMultiplicity, md, lSwitch);
      }
    }
    t = System.currentTimeMillis() - t;

    mg.summary();

    if (!flags.isSet(GenerateGraphsCli.QUIET_FLAG)) {
      final StringBuilder sb = new StringBuilder(">Z ");
      sb.append(mg.getGraphsInputCount())
        .append(" graphs read from stdin; ")
        .append(mg.getGraphsOutputCount());
      if (!uSwitch) {
        sb.append(" multigraphs written to stdout");
      } else {
        sb.append(" multigraphs generated");
      }
      sb.append(String.format("; %.2f sec", t / 1000));
      System.err.println(sb);
    }
  }
}
