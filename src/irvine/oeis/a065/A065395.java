package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065395 Commutator of sigma and phi functions.
 * @author Sean A. Irvine
 */
public class A065395 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Functions.SIGMA1.z(fs.phi()).subtract(Functions.PHI.z(fs.sigma()));
  }
}
