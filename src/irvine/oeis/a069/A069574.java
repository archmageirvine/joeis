package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069574 Smallest n-digit prime in which the k-th digit is a divisor or a multiple of k, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A069574 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  private boolean is(Z p) {
    long k = 0;
    while (!p.isZero()) {
      final Z[] qr = p.divideAndRemainder(10);
      final long r = qr[1].longValue();
      if (r == 0 || r % ++k != 0 && k % r != 0) {
        return false;
      }
      p = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    mA = mA.multiply(10);
    Z p = mA;
    mA = mA.add(1);
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p)) {
        return p;
      }
    }
  }
}
