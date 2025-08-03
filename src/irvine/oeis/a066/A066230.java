package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066230 f-perfect numbers, where f(m) = m - 1.
 * @author Sean A. Irvine
 */
public class A066230 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.sigma0()).equals(2 * mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
