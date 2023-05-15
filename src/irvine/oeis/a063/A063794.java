package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063794 usigma(n)=n+phi(n).
 * @author Sean A. Irvine
 */
public class A063794 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.unitarySigma().equals(fs.phi().add(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
