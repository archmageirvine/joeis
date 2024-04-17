package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063880 Numbers k such that sigma(k) = 2*usigma(k).
 * @author Sean A. Irvine
 */
public class A063880 extends Sequence1 {

  private long mN = 107;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.unitarySigma().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
