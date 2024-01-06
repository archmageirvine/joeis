package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067704 Numbers n such that phi(sigma(n)) = 2*phi(n).
 * @author Sean A. Irvine
 */
public class A067704 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Euler.phi(fs.sigma()).equals(fs.phi().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
