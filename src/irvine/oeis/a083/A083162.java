package irvine.oeis.a083;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083162 a(n) is the smallest unused proper divisor or proper multiple of n such that a(n)/n != a(m)/m for all m &lt; n.
 * @author Sean A. Irvine
 */
public class A083162 extends Sequence1 {

  private final LongDynamicBooleanArray mUsedK = new LongDynamicBooleanArray();
  private final HashSet<Q> mUsed = new HashSet<>();
  private long mN = 0;
  private long mLeastUnusedK = 1;

  @Override
  public Z next() {
    ++mN;
    while (mUsedK.isSet(mLeastUnusedK)) {
      ++mLeastUnusedK;
    }
    long k = mLeastUnusedK;
    while (true) {
      while (mUsedK.isSet(k)) {
        ++k;
      }
      if (k != mN) {
        if (mN % k == 0) {
          final Q r = new Q(k, mN);
          if (mUsed.add(r)) {
            mUsedK.set(k);
            return Z.valueOf(k);
          }
        }
        if (k % mN == 0) {
          final Q r = new Q(k / mN);
          if (mUsed.add(r)) {
            mUsedK.set(k);
            return Z.valueOf(k);
          }
        }
      }
      ++k;
    }
  }
}

