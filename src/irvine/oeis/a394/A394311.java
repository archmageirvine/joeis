package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394311 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A394311 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z[] qr = p.multiply(mN + 1).subtract(1).divideAndRemainder(mN);
      if (qr[1].isZero() && mPrime.isPrime(qr[0])) {
        return p;
      }
    }
  }
}
