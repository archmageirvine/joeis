package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006087.
 * @author Sean A. Irvine
 */
public class A006087 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      final Z m = mN.multiply(fs.unitarySigma0());
      final Z[] qr = m.divideAndRemainder(fs.unitarySigma());
      if (Z.ZERO.equals(qr[1])) {
        return qr[0];
      }
    }
  }
}

