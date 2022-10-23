package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006086 Unitary harmonic numbers (those for which the unitary harmonic mean is an integer).
 * @author Sean A. Irvine
 */
public class A006086 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z m = mN.multiply(fs.unitarySigma0());
      if (m.mod(fs.unitarySigma()).isZero()) {
        return mN;
      }
    }
  }
}

