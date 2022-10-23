package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051899 Smallest prime p such that (p-1)/(2*n) is also a prime.
 * @author Sean A. Irvine
 */
public class A051899 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mN = mN.add(2);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z q = mN.multiply(p).add(1);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
