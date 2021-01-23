package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A027419 Number of distinct products ij with 0 &lt;= i, j &lt;= n-th prime.
 * @author Sean A. Irvine
 */
public class A027419 extends A027384 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mPrime.isPrime(mN)) {
        return t;
      }
    }
  }
}
