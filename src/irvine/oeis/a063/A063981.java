package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063981 Numbers n such that t(n) = sigma(n) - n, where t(n) = A008472(n+1) - A008472(n).
 * @author Sean A. Irvine
 */
public class A063981 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(mN).equals(Functions.SOPF.z(mN + 1).subtract(fs.sopf()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
