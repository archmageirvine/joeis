package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067801 Numbers m such that bigomega(m)=2*omega(m).
 * @author Sean A. Irvine
 */
public class A067801 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() == 2L * fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
