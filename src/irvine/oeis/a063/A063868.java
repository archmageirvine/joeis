package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063868 Solutions to phi(x + omega(x)) = phi(x) + d(x), where phi() = A000010(), d() = A000005() and omega() = A001221().
 * @author Sean A. Irvine
 */
public class A063868 extends Sequence1 {

  private long mN = 32;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().add(fs.sigma0()).equals(Functions.PHI.z(fs.omega() + mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
