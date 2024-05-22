package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033632 Numbers k such that sigma(phi(k)) = phi(sigma(k)).
 * @author Sean A. Irvine
 */
public class A033632 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z sigma = fs.sigma();
      final Z phi = fs.phi();
      if (Functions.SIGMA1.z(phi).equals(Functions.PHI.z(sigma))) {
        return Z.valueOf(mN);
      }
    }
  }
}
