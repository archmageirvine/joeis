package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045796 Numbers m = usigma(sigma(k))/k such that usigma(sigma(k)) is divisible by k.
 * @author Sean A. Irvine
 */
public class A045796 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z[] qr = Jaguar.factor(Jaguar.factor(mN).sigma()).unitarySigma().divideAndRemainder(mN);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

