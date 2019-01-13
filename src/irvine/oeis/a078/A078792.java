package irvine.oeis.a078;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A078792.
 * @author Sean A. Irvine
 */
public class A078792 implements Sequence {

  // There might be a better way, I made this by accident while trying to make A00109

  protected int mN = 0;
  private Set<Graph> mGraphs = null;
  private final long[] mWorkspace = new long[100];
  private final OptionBlk mOptions = new OptionBlk();

  {
    mOptions.setCanon(1);
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    final Set<Graph> next = new HashSet<>();
    if (mGraphs == null) {
      final Graph g = GraphFactory.create(3);
      g.addEdge(0, 1);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      next.add(g);
    } else {
      final int[] lab = new int[mN];
      final int[] ptn = new int[mN];
      final int[] orb = new int[mN];
      final NautySet set = new NautySet(mN);
      final StatsBlk stats = new StatsBlk();
      final int n = mN - 1;
      for (final Graph g : mGraphs) {
        for (int u = 0; u < n; ++u) {
          int v = u;
          while ((v = g.nextVertex(u, v)) >= 0) {
            int w = v;
            while ((w = g.nextVertex(v, w)) >= 0) {
              if (g.isAdjacent(u, w)) {
                final Graph h = g.copy(n + 1);
                h.addEdge(u, n);
                h.addEdge(v, n);
                h.addEdge(w, n);
                try {
                  next.add(new Nauty(h, lab, ptn, set, orb, mOptions, stats, mWorkspace).canon());
                } catch (final IOException e) {
                  throw new RuntimeException(e);
                }
              }
            }
          }
        }
      }
    }
    mGraphs = next;
    return Z.valueOf(mGraphs.size());
  }
}

