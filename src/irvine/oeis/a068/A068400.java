package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068400 Numbers n such that sigma(n)=phi(n*bigomega(n)).
 * @author Sean A. Irvine
 */
public class A068400 extends Sequence1 {

  private long mN = 247;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(Functions.PHI.z(fs.bigOmega() * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
