package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069970.
 * @author Sean A. Irvine
 */
public class A070011 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() % fs.omega() != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
