package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082058 a(n) is the smallest k such that prime(k) contains the digits of n as a substring.
 * @author Sean A. Irvine
 */
public class A082058 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long m = 0;
    long p = 1;
    while (true) {
      ++m;
      p = mPrime.nextPrime(p);
      if (p == mN || (p > mN && String.valueOf(p).contains(s))) {
        return Z.valueOf(m);
      }
    }
  }
}
