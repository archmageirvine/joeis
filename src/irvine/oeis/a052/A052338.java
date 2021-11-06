package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a050.A050443;

/**
 * A052338 a(n) = A050443(n-th prime)/(n-th prime).
 * @author Sean A. Irvine
 */
public class A052338 extends A050443 {

  private final Fast mPrime = new Fast();
  protected long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mPrime.isPrime(++mN)) {
        return t.divide(mN);
      }
    }
  }
}
