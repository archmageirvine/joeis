package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045980 Numbers of the form x^3 + y^3 or x^3 - y^3.
 * @author Sean A. Irvine
 */
public class A045980 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++ mN == 0) {
        return Z.ZERO;
      }
      for (final Z d : Jaguar.factor(mN).divisors()) {
        final Z d2 = d.square();
        final Z l = d2.subtract(mN / d.longValue());
        final Z[] qr = l.divideAndRemainder(Z.THREE);
        if (qr[1].isZero()) {
          final Z t = d2.subtract(qr[0].multiply(4));
          if (t.signum() >= 0 && t.isSquare()) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
