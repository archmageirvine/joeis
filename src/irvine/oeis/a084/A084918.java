package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084918 Numbers n &gt;= 1000, such that if prime P divides n, then so does each smaller prime.
 * @author Sean A. Irvine
 */
public class A084918 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 1022;

  private boolean is(final long n) {
    long m = Functions.MAKE_ODD.l(n);
    long p = 3;
    while (m != 1) {
      if (m % p != 0) {
        return false;
      }
      while (m % p == 0) {
        m /= p;
      }
      p = mPrime.nextPrime(p);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
