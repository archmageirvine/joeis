package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055742 Numbers k such that k and EulerPhi(k) have same number of prime factors, counted without multiplicity.
 * @author Sean A. Irvine
 */
public class A055742 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.phi()).omega() == fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
