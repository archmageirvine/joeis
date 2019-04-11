package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006086 Unitary harmonic numbers (those for which the unitary harmonic mean is an integer).
 * @author Sean A. Irvine
 */
public class A006086 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      final Z m = mN.multiply(fs.unitarySigma0());
      if (Z.ZERO.equals(m.mod(fs.unitarySigma()))) {
        return mN;
      }
    }
  }
}

