package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is arithmetic (see A003601).
 * @author Georg Fischer
 */
public class Arithmetic extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma(1).mod(fs.sigma(0)).isZero();
  }

  @Override
  public boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma(1).mod(fs.sigma(0)).isZero();
  }
}
