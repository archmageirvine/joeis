package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067878 Numbers n such that sigma(n)=phi(n*omega(n)-1).
 * @author Sean A. Irvine
 */
public class A067878 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(Functions.PHI.z(mN * fs.omega() - 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
