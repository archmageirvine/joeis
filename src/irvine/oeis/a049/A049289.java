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
 * A049289 Number of nonisomorphic self-complementary circulant graphs (Cayley graphs for the cyclic group) of order 4n+1.
 * @author Sean A. Irvine
 */
public class A049289 implements Sequence {

  private int mN = -3;
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

  private void search(final Graph g, int pos) {
    if (pos <= 0) {
      try {
        final Graph canon1 = new Nauty(g, mLabels, mPartition, null, mOrbits, mOptions, mStats, mWorkspace).canon();
        final Graph canon2 = new Nauty(g.complement(), mLabels, mPartition, null, mOrbits, mOptions, mStats, mWorkspace).canon();
        if (canon1.equals(canon2)) {
          mCanons.add(canon1);
        }
      } catch (IOException e) {
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
    mN += 4;
    mCanons.clear();
    mLabels = new int[mN];
    mPartition = new int[mN];
    mOrbits = new int[mN];
    mStats = new StatsBlk();
    search(GraphFactory.create(mN), mN / 2);
    return Z.valueOf(mCanons.size());
  }
}
