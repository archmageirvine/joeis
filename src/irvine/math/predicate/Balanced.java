package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is balanced (see A020492).
 * @author Georg Fischer
 */
public class Balanced extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
//    return Functions.SIGMA1.z(n).mod(Functions.PHI.z(n)).isZero();
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma().mod(fs.phi()).isZero();
  }

  @Override
  public boolean is(final long n) {
//    return Functions.SIGMA1.z(n).mod(Functions.PHI.l(n)) == 0;
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma().mod(fs.phi()).isZero();
  }

}
