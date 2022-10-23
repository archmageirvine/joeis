package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A002346 Consider all primes of form p = (x^2 + 11y^2 )/4; sequence gives values of x.
 * @author Sean A. Irvine
 */
public class A002346 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z p = mP.shiftLeft(2);
      Z y = Z.ZERO;
      while (true) {
        y = y.add(1);
        final Z x2 = p.subtract(y.square().multiply(11));
        if (x2.signum() < 0) {
          break;
        }
        final Z[] s = x2.sqrtAndRemainder();
        if (s[1].isZero()) {
          return s[0];
        }
      }
    }
  }
}
