package irvine.oeis.a054;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.nauty.MultigraphColour;
import irvine.math.nauty.VertexColour;
import irvine.math.nauty.VertexColourProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A054981 Number of certain connected weighted pseudo-graphs.
 * @author Sean A. Irvine
 */
public class A054981 implements Sequence, GraphProcessor {

  // The approach taken here uses colouring to deal with the loops
  // (thanks to Brendan McKay for suggesting this idea).
  // Roughly speaking, we are doing the nauty equivalent of
  // geng -cD4 2 | vcolg -D4,2 -T | multig -V -D4
  // with a special processor to compute the weight of each candidate
  // according to the rules of this sequence.

  private static final VertexColour VERTEX_COLOR = new VertexColour(2, 0, Multigraph.NOLIMIT, new int[] {Multigraph.NOLIMIT, Multigraph.NOLIMIT}, new int[2], new int[] {4, 2});
  private static final MultigraphColour MULTI = new MultigraphColour(4, 0, Multigraph.NOLIMIT, 4);

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private int mM = 2;
  private long mColouredProcessed = 0;
  private final DynamicLongArray mCounts = new DynamicLongArray();
  {
    mCounts.set(2, 1); // Contribution from a single vertex graph (only case with double loop)
  }

  private final VertexColourProcessor mVertexColourProcessor = (graph, col) -> {
    //System.out.println("Coloured: " + graph + " " + Arrays.toString(col));
    ++mColouredProcessed;
    MULTI.multi(graph, col, (v, e, deg) -> {
      if (deg == null) {
        return; // when does this happen?
      }
      final int n = deg.length;
      // Compute weight and reject if not acceptable
      boolean ok = true;
      int wt = 0;
      for (int k = 0; k < n; ++k) {
        final int d = deg[k] + 2 * col[k];
        ok &= d <= 4 && d != 2;
        if (d == 3) {
          wt += 1;
        } else if (d == 4) {
          wt += 2;
        }
      }
      // Compute weight
      if (ok) {
        mCounts.set(wt, mCounts.get(wt) + 1);
      }
    });
  };

  @Override
  public void process(final Graph graph) {
    //System.out.println("Premulti: " + graph);
    VERTEX_COLOR.colour(graph, mVertexColourProcessor);
  }

  private void generate(final int n) {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(n);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(4);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setProcessor(this);
    gg.sanitizeParams();
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    if (mVerbose) {
      final StringBuilder sb = new StringBuilder("Counts after ");
      sb.append(n);
      sb.append(" vertices -> ");
      int k =0;
      while (mCounts.get(k) != 0 || mCounts.get(k + 1) != 0) {
        sb.append(mCounts.get(k)).append(", ");
        ++k;
      }
      StringUtils.message(sb.toString());
      StringUtils.message("A total of " + mColouredProcessed + " coloured graphs have been processed");
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mM <= 2 * mN + 4) {
      generate(mM);
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
