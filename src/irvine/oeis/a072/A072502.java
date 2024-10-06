package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072502 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(Functions.MAKE_ODD.l(++mN));
      if (fs.omega() == 1 && fs.maxExponent() == 2 || fs.sigma0().equals(Z.THREE)) {
        return Z.valueOf(mN);
      }
    }
  }
}

