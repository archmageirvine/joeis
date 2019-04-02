package irvine.oeis.a005;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005007 Number of cubic (i.e., regular of degree 3) generalized Moore graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A005007 implements Sequence, GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mCount = 0;

  // The following Moore graph test is specialized for 3-regular graphs

  private boolean isMoore(final Graph graph, final int v) {
    final int n = graph.order();
    if (n <= 4) {
      return true;
    }
    final boolean[] seen = new boolean[n];
    seen[v] = true;
    int u = -1;
    int e = 0;
    int[] next = new int[3];
    while ((u = graph.nextVertex(v, u)) != -1) {
      seen[u] = true;
      next[e++] = u;
    }
    assert e == 3;
    int t = 4; // vertices used so far
    while (true) {
      final int[] prev = next;
      e *= 2; // * (r-1)
      next = new int[e];
      int p = 0;
      for (final int vv : prev) {
        assert seen[vv];
        int uu = -1;
        while ((uu = graph.nextVertex(vv, uu)) != -1) {
          if (!seen[uu]) {
            if (p >= e) {
              return false;
            }
            if (++t == n) {
              return true; // We've allocated every vertex
            }
            seen[uu] = true;
            next[p++] = uu;
          }
        }
      }
      if (p != e && t < n) {
        return false;
      }
    }
  }

  private boolean isMoore(final Graph graph) {
    for (int v = 0; v < graph.order(); ++v) {
      if (!isMoore(graph, v)) {
        return false;
      }
    }
    if (mVerbose) {
      System.out.println(graph.toString());
    }
    return true;
  }

  @Override
  public void process(final Graph graph) throws IOException {
    if (isMoore(graph)) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    mN += 2;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setMaxEdges(mN * (mN - 1));
    gg.setProcessor(this);
    gg.sanitizeParams();
    mCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    return Z.valueOf(mCount);
  }

}

