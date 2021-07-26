package irvine.oeis.a049;

import java.io.IOException;
import java.util.HashSet;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049287 Number of nonisomorphic circulant graphs, i.e., undirected Cayley graphs for the cyclic group of order n.
 * @author Sean A. Irvine
 */
public class A049287 implements Sequence {

  private int mN = 0;
  private final HashSet<Graph> mCanons = new HashSet<>();
  private final long[] mWorkspace = new long[100];
  private final OptionBlk mOptions = new OptionBlk();
  private int[] mLabels;
  private int[] mPartition;
  private int[] mOrbits;
  private StatsBlk mStats;
  {
    mOptions.setCanon(1);
  }

  private void search(final Graph g, final int pos) {
    if (pos <= 0) {
      try {
        final Graph canon = new Nauty(g, mLabels, mPartition, null, mOrbits, mOptions, mStats, mWorkspace).canon();
        mCanons.add(canon);
      } catch (final IOException e) {
        throw new RuntimeException(e);
      }
      return;
    }
    // Do not include pos
    search(g, pos - 1);
    // Include pos
    final Graph copy = g.copy();
    final int n = g.order();
    for (int u = 0; u < n; ++u) {
      copy.addEdge(u, (u + pos) % n);
      copy.addEdge(u, (u + n - pos) % n);
    }
    search(copy, pos - 1);
  }

  @Override
  public Z next() {
    mCanons.clear();
    mLabels = new int[++mN];
    mPartition = new int[mN];
    mOrbits = new int[mN];
    mStats = new StatsBlk();
    search(GraphFactory.create(mN), mN / 2);
    return Z.valueOf(mCanons.size());
  }
}
