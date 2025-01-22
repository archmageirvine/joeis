package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074663.
 * @author Sean A. Irvine
 */
public class A074471 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s = fs.sigma();
      if (fs.sigma2().mod(s).isZero()
        && fs.sigma(4).mod(s).isZero()
        && fs.sigma(6).mod(s).isZero()
        && fs.sigma(8).mod(s).isZero()
        && fs.sigma(10).mod(s).isZero()){
        return Z.valueOf(mN);
      }
    }
  }
}

