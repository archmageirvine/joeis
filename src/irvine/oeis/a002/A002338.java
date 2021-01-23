package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002338 x such that p = (x^2 + 27*y^2)/4, where p is the n-th prime of the form 3k+1.
 * @author Sean A. Irvine
 */
public class A002338 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(3);
      if (r == 1) {
        Z y = Z.ZERO;
        while (true) {
          final Z p = mP.shiftLeft(2);
          y = y.add(1);
          final Z x2 = p.subtract(y.square().multiply(27));
          final Z[] s = x2.sqrtAndRemainder();
          if (s[1].isZero()) {
            return s[0];
          }
        }
      }
    }
  }
}
