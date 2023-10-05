package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066219 extends Sequence1 {

  private long mN = 5;
  private FactorSequence mFactorSequence = Jaguar.factor(5);

  @Override
  public Z next() {
    while (true) {
      final FactorSequence t = mFactorSequence;
      mFactorSequence = Jaguar.factor(++mN);
      if (t.phi().subtract(mFactorSequence.phi()).abs().equals(t.sigma0().subtract(mFactorSequence.sigma0()).abs())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
