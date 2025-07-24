package irvine.oeis.a386;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A386364 allocated for Tamas Sandor Nagy.
 * @author Sean A. Irvine
 */
public class A386364 extends Sequence1 {

  private long mP = 1;
  private long mK = 0;
  private final TreeSet<Long> mCluster = new TreeSet<>();
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();

  private void buildCluster(long p, long k) {
    mCluster.add(p);
    long m = 0;
    while (true) {
      final long t = p + 2 * (k - 1) + ++m;
      final long q = Functions.PRIME.l(k + m);
      if (t == q) {
        // in cluster
        mCluster.add(q);
        p = q;
        k += m;
        m = 0;
      } else if (t < q) {
        break;
      }
    }
    for (final long q : mCluster) {
      mSeen.set(q);
    }
  }

  @Override
  public Z next() {
    while (mCluster.isEmpty()) {
      ++mK;
      mP = Functions.NEXT_PRIME.l(mP);
      if (!mSeen.isSet(mP)) {
        buildCluster(mP, mK);
      }
    }
    return Z.valueOf(mCluster.pollFirst());
  }
}
