package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067708 Numbers n such that phi(sigma(n)) = 5*phi(n).
 * @author Sean A. Irvine
 */
public class A067708 extends Sequence1 {

  private long mN = 335;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.PHI.z(fs.sigma()).equals(fs.phi().multiply(5))) {
        return Z.valueOf(mN);
      }
    }
  }
}
