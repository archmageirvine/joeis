package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001142;

/**
 * A056077 Indices n of terms of sequence A001142, Product_{k=0..n} binomial(n,k), that are divisible by all primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A056077 extends A001142 {

  private final Fast mPrime = new Fast();
  {
    super.next();
  }

  private boolean is(final Z t) {
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      if (t.mod(p) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
