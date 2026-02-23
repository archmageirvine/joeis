package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057852 Numbers k such that k | sigma_2(k) + sigma_1(k) + sigma_0(k).
 * @author Sean A. Irvine
 */
public class A057852 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().add(fs.sigma()).add(fs.sigma2()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
