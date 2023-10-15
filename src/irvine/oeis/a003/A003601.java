package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003601 Numbers j such that the average of the divisors of j is an integer: sigma_0(j) divides sigma_1(j). Alternatively, numbers j such that tau(j) (A000005(j)) divides sigma(j) (A000203(j)).
 * @author Sean A. Irvine
 */
public class A003601 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z sigma1 = fs.sigma();
      final long sigma0 = fs.sigma0AsLong();
      if (sigma1.mod(sigma0) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
