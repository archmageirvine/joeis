package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002335 Least positive integer y such that A038873(n) = x^2 - 2y^2 for some x.
 * @author Sean A. Irvine
 */
public class A002335 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.TWO.equals(mP)) {
        return Z.ONE;
      }
      final long r = mP.mod(8);
      if (r == 1 || r == 7) {
        Z y = Z.ZERO;
        while (true) {
          y = y.add(1);
          final Z x2 = mP.add(y.square().multiply2());
          final Z[] s = x2.sqrtAndRemainder();
          if (s[1].isZero()) {
            return y;
          }
        }
      }
    }
  }
}
