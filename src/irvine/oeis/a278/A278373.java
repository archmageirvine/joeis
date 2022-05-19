package irvine.oeis.a278;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a051.A051709;

/**
 * A278373 Numbers of the form sigma(k) + phi(k) - 2k.
 * @author Sean A. Irvine
 */
public class A278373 extends A051709 {

  // Heuristic - will eventually detect any failure

  private static final int HEURISTIC_STEPS = 3;

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLast = Z.NEG_ONE;
  private long mM = 0;

  @Override
  public Z next() {
    // 3k^2 appears to be an upper bound to A278374

    final long lim = Math.max(10, (mA.isEmpty() ? mLast : mA.first()).square().multiply(HEURISTIC_STEPS).longValueExact());
    while (mM < lim) {
      final Z t = super.next();
      if (t.compareTo(mLast) > 0) {
        mA.add(t);
      } else if (mSeen.add(t)) {
        throw new RuntimeException("Heuristic failed: " + t + " should have been output earlier");
      }
      ++mM;
    }
    mLast = mA.pollFirst();
    mSeen.add(mLast);
    return mLast;
  }
}
