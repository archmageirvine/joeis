package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063829 usigma(n) = 2n + d(n), where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A063829 extends Sequence1 {

  private long mN = 149;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.unitarySigma().equals(fs.sigma0().add(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
