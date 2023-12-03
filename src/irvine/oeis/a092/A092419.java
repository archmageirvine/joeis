package irvine.oeis.a092;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A092419 Let k = n-th nonsquare = A000037(n); then a(n) = smallest prime p such that the Kronecker-Jacobi symbol K(k,p) = -1.
 * @author Sean A. Irvine
 */
public class A092419 extends A000037 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (LongUtils.kronecker(t, p) == -1) {
        return Z.valueOf(p);
      }
    }
  }
}
