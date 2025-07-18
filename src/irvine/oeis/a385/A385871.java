package irvine.oeis.a385;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A385871 extends Sequence1 {

  private long mP = 1;
  private long mK = 0;
  private final LongDynamicLongArray mClusterSizes = new LongDynamicLongArray();

  private void buildCluster(long p, long k) {
    final HashSet<Long> cluster = new HashSet<>();
    cluster.add(p);
    long m = 0;
    while (true) {
      final long t = p + 2 * (k - 1) + ++m;
      final long q = Functions.PRIME.l(k + m);
      if (t == q) {
        // in cluster
        cluster.add(q);
        p = q;
        k += m;
        m = 0;
      } else if (t < q) {
        break;
      }
    }
    //System.out.println("Cluster: " + cluster);
    for (final long q : cluster) {
      mClusterSizes.set(q, cluster.size());
    }
  }

  @Override
  public Z next() {
    ++mK;
    mP = Functions.NEXT_PRIME.l(mP);
    if (mClusterSizes.get(mP) == 0) {
      buildCluster(mP, mK);
    }
    return Z.valueOf(mClusterSizes.get(mP));
  }
}
