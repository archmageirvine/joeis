package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a006.A006218;

/**
 * A057494 a(n) = Sum_{k = 1..10^n} d(k) where d(n) = number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A057494 extends A006218 {

  private long mLim = 1;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (++mN == mLim) {
        mLim *= 10;
        return t;
      }
    }
  }
}
