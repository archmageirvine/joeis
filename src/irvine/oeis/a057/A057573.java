package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a051.A051351;

/**
 * A057573 Number of primes in A051351 which have index &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A057573 extends A051351 {

  {
    setOffset(0);
  }

  private long mN = 0;
  private long mCount = 0;
  private long mLim = 0;

  @Override
  public Z next() {
    mLim = mLim == 0 ? 1 : mLim * 10;
    while (mN <= mLim) {
      ++mN;
      final Z t = super.next();
      if (t.isProbablePrime()) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
