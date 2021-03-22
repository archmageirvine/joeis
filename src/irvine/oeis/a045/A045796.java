package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045796 Numbers m = usigma(sigma(n))/n such that usigma(sigma(n)) is divisible by n.
 * @author Sean A. Irvine
 */
public class A045796 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z[] qr = Cheetah.factor(Cheetah.factor(mN).sigma()).unitarySigma().divideAndRemainder(mN);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

