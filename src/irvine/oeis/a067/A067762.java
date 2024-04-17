package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067762 Numbers n such that bigomega(sigma(n))=bigomega(n).
 * @author Sean A. Irvine
 */
public class A067762 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.BIG_OMEGA.l(fs.sigma()) == fs.bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
