package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054030 Sigma(n)/n for n such that sigma(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A054030 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = Jaguar.factor(++mN).sigma().divideAndRemainder(Z.valueOf(mN));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

