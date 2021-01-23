package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006087 Unitary harmonic means H(n) of the unitary harmonic numbers (A006086).
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
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

