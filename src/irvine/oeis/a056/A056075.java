package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056075 Numbers n such that n divides sigma(n) - d(n).
 * @author Sean A. Irvine
 */
public class A056075 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.sigma0()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
