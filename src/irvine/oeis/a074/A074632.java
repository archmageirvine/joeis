package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074663.
 * @author Sean A. Irvine
 */
public class A074632 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s = fs.sigma();
      if (fs.sigma2().mod(s).isZero()
        && fs.sigma(3).mod(s).isZero()
        && fs.sigma(4).mod(s).isZero()
        && fs.sigma(5).mod(s).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

