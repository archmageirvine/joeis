package irvine.math.nauty;

import java.io.IOException;
import java.util.Arrays;

import irvine.math.graph.Graph;

/**
 * Add edges to a vertex coloured graph in all possible way subject to given constraints.
 * @author Sean A. Irvine
 * @author Brendan McKay
 */
public class MultigraphColour extends Multigraph {

  // Based on the vmulti method of multig.c version 2.1; B D McKay, March 4, 2022

  private static final boolean DEBUG = "true".equals(System.getProperty("nauty.debug"));

  private final int mMaxMultiplicity;
  private final int mMinEdges;
  private final int mMaxEdges;
  private final int mMaxDeg;

  /**
   * Construct an instance for adding edges to a coloured graph.
   * @param maxMultiplicity maximum multiplicity of an edge
   * @param minEdges minimum total number of edges
   * @param maxEdges maximum total number of edges
   * @param maxDeg maximum vertex degree
   */
  public MultigraphColour(final int maxMultiplicity, final int minEdges, final int maxEdges, final int maxDeg) {
    super(null, false, false, false);
    mMaxMultiplicity = maxMultiplicity;
    mMinEdges = minEdges;
    mMaxEdges = maxEdges;
    mMaxDeg = maxDeg;
  }

  private void vmulti(final Graph g, final int[] colour, final int nfixed, final boolean lswitch) {

    final int n = g.order();
    final int ne = g.size();
    final OptionBlk options = new OptionBlk();
    final StatsBlk stats = new StatsBlk();
    final long[] workspace = new long[2 * n];

    final int[] weight = new int[n];
    final int[] deg = new int[n];
    int maxd = 0;
    for (int i = 0; i < n; ++i) {
      final int thisdeg = (int) g.degree(i);
      deg[i] = thisdeg;
      if (thisdeg > maxd) {
        maxd = thisdeg;
      }
      if (thisdeg == 0) {
        weight[i] = -i - 1;
      } else if (i < nfixed) {
        weight[i] = 2 * colour[i];
      } else {
        weight[i] = 2 * colour[i] + 1;
      }
    }

    if (mMaxDeg >= 0 && maxd > mMaxDeg) {
      return;
    }

    if (ne == 0 && mMinEdges <= 0 && (!lswitch || (lswitch && (mMaxDeg & 1) == 0))) {
      tryThisOne(null, lswitch, deg, mMaxDeg, 0, n);
      return;
    }

    int k = 0;
    for (int i = 0; i < n; ++i) {
      for (int j = i; (j = g.nextVertex(i, j)) >= 0; ) {
        mV0[k] = i;
        mV1[k] = j;
        mEdgeNo[i][j] = k;
        mEdgeNo[j][i] = k;
        mLastLevel[i] = k;
        mLastLevel[j] = k;
        ++k;
      }
    }

    final boolean isreg = !lswitch && (mMaxDeg >= 0 && 2L * mMinEdges == n * (long) mMaxDeg);
    /* Case of regular multigraphs */

    final int[] def = new int[n];
    final int[] delta = new int[n];
    if (isreg) { /* regular case */
      /* Condition: def(v) <= total def of neighbours */
      for (int i = 0; i < n; ++i) {
        def[i] = mMaxDeg - deg[i];
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

    if ((isreg || lswitch) && (mMaxDeg & n & 1) == 1) {
      return;
    }

    int maxedges = mMaxEdges;
    int maxmult = mMaxMultiplicity;
    if (maxedges == NOLIMIT) {
      if (maxmult == NOLIMIT) {
        maxedges = mMaxDeg * n / 2;
      } else {
        maxedges = ne * maxmult;
      }
    }
    if (maxmult == NOLIMIT) {
      maxmult = maxedges - ne + 1;
    }
    if (mMaxDeg >= 0 && maxmult > mMaxDeg) {
      maxmult = mMaxDeg;
    }
    if (maxedges < ne || ne * maxmult < mMinEdges) {
      return;
    }

    if (n > MAXNV || ne > MAXNE) {
      throw new RuntimeException(">E multig: MAXNV or MAXNE exceeded");
    }

    final int[] lab = new int[n];
    final int[] ptn = new int[n];
    VertexColour.setlabptn(weight, lab, ptn, n);
    final NautySet active = new NautySet(n);
    active.set(0);
    for (int i = 1; i < n; ++i) {
      if (ptn[i - 1] == 0) {
        active.set(i);
      }
    }

    boolean hasloops = false;
    for (int i = 0; i < n; ++i) {
      if (g.isAdjacent(i, i)) {
        hasloops = true;
        break;
      }
    }

    final NauGroup ng = new NauGroup();
    options.mDefaultPtn = false;
    options.mDigraph = hasloops;
    options.mUserAutomProc = ng;
    options.mUserLevelProc = ng;

    final int[] orbits = new int[n];
    try {
      new Nauty(g, lab, ptn, active, orbits, options, stats, workspace);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }

    mGroupSize = stats.groupSize().longValueExact();
    final GroupRecord group = ng.groupPtr(false);
    ng.makeCosetReps(group);

    mLastRejectOk = false;

    if (isreg) {
      scanRegular(0, ne, mMinEdges, maxedges, 0, maxmult, group, n, delta, def, mMaxDeg);
    } else if (lswitch) {
      scanLoops(0, ne, mMinEdges, maxedges, 0, maxmult, group, n, deg, mMaxDeg);
    } else if (mMaxDeg >= 0) {
      scanMaxDeg(0, ne, mMinEdges, maxedges, 0, maxmult, group, n, deg, mMaxDeg);
    } else {
      scan(0, ne, mMinEdges, maxedges, 0, maxmult, group, n);
    }
  }

  /**
   * Colour the graph is all possible ways, subject to the constraints of this instance,
   * sending each graph to the supplied processor.
   * @param g graph to colour
   * @param colours the colour of each vertex
   * @param proc when to send the graphs.
   */
  public long multi(final Graph g, final int[] colours, final MultigraphProcessor proc) {
    if (DEBUG) {
      System.out.println("Calling multigraph colouring on " + g + " " + Arrays.toString(colours));
    }
    mGraphsOutput = 0;
    setProcessor(proc);
    vmulti(g, colours, 0, false);
    return mGraphsOutput;
  }
}
