package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070002 Numbers k such that phi(P(k)) - P(phi(k)) = 1, where P(k) is the largest prime factor of k.
 * @author Sean A. Irvine
 */
public class A070002 extends Sequence1 {

  private long mN = 44;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.PHI.z(fs.largestPrimeFactor()).subtract(Functions.GPF.z(fs.phi())).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
