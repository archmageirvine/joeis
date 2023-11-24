package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066887 Numbers k such that Omega(phi(k)) = Omega(k) where phi is the Euler totient function and Omega(k) is the number of repeated prime factors in k.
 * @author Sean A. Irvine
 */
public class A066887 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.phi()).bigOmega() == fs.bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}

