package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002342 Least positive integer x such that p=(x^2-5y^2)/4 where p is the n-th odd prime such that 5 is a square mod p.
 * @author Sean A. Irvine
 */
public class A002342 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.FIVE.jacobi(mP) >= 0) {
        final Z p = mP.shiftLeft(2);
        Z y = Z.ZERO;
        while (true) {
          y = y.add(1);
          final Z x2 = p.add(y.square().multiply(5));
          final Z[] s = x2.sqrtAndRemainder();
          if (Z.ZERO.equals(s[1])) {
            return s[0];
          }
        }
      }
    }
  }
}
