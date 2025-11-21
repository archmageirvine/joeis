package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a064.A064182;

/**
 * A390602 Number of numbers m &lt;= 10^n that have a prime divisor greater than sqrt(10^n) (i.e., A006530(m)&gt;sqrt(10^n)).
 * @author Sean A. Irvine
 */
public class A390602 extends A064182 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    Z s = super.next();
    long p = 2;
    while (p * p <= mLim) {
      s = s.subtract(mLim / p);
      p = mPrime.nextPrime(p);
    }
    return s;
  }
}
