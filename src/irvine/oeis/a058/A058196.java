package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051351;

/**
 * A058196 Sum of digits of first 10^n primes.
 * @author Sean A. Irvine
 */
public class A058196 extends A051351 {

  private long mLimit = 1;
  private long mN = -1;

  @Override
  public Z next() {
    Z t = null;
    while (mN < mLimit) {
      t = super.next();
      ++mN;
    }
    mLimit *= 10;
    return t;
  }
}
