package irvine.oeis.a054;

import java.io.IOException;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A054981 Number of certain connected weighted pseudo-graphs.
 * @author Sean A. Irvine
 */
public class A054981 implements Sequence, GraphProcessor {

  // todo: I have prototype code in C using nauty that does this sequence correctly
  // todo: We need a Java version of vcolg
  // todo: We need to update multigraph to support colors
  // todo: We need the outproc done here

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private final DynamicLongArray mCounts = new DynamicLongArray();

  private Multigraph mMultigraph = null;

  @Override
  public void process(final Graph graph) throws IOException {
    System.out.println("Premulti: " + graph);
    mMultigraph.multi(graph, 0, graph.size(), Multigraph.NOLIMIT, Multigraph.NOLIMIT, 4, false);
  }

  private void handleLoops(final int[] deg, final int v) {
    if (v >= deg.length) {
      // Do the final analysis
      int wt = 0;
      for (int k = 0; k < deg.length; ++k) {
        final long d = deg[k];
        if (d == 2 || d == 0) { // d == 0 can only happen for single vertex
          return; // Not a valid graph for this sequence
        }
        if (d == 3) {
          wt += 1;
        } else if (d == 4) {
          wt += 2;
        }
      }
      System.out.println("Found a solution: " + Arrays.toString(deg) + " -> wt=" + wt);
      mCounts.set(wt, mCounts.get(wt) + 1);
      return;
    }
    // Add loops in all possible ways
    // todo ugh: this breaks isomorphism in some cases A---B puts a loop at A and a loop at B separately!
    if (deg[v] < 3) {
      deg[v] += 2;
      handleLoops(deg, v);
      deg[v] -= 2;
    }
    if (deg[v] != 2) {
      handleLoops(deg, v + 1);
    }
  }

  private void generate(final int n) {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(n);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(4);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mMultigraph = new Multigraph(null, false, false, false);
    mMultigraph.setProcessor((v, e, deg) -> {
      if (deg == null) {
        return; // when does this happen?
      }
      System.out.println(v + " " + e + " " + Arrays.toString(deg));
      handleLoops(deg, 0);
    });
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  {
    for (int k = 1; k <= 6; ++k) {
      generate(k);
    }
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mCounts.get(mN));
  }
}
