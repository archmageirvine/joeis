package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085229 Smallest number which is coprime to n and to a(n-1), and is not yet in the sequence; a(1)=1.
 * @author Sean A. Irvine
 */
public class A085229 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;
  private long mN = 0;
  private long mA = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k) && Functions.GCD.l(mN, k) == 1 && Functions.GCD.l(mA, k) == 1) {
        mUsed.set(k);
        mA = k;
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
