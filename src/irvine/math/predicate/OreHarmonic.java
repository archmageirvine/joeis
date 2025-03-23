package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is a harmonic number or an Ore number (see A001599).
 * @author Georg Fischer
 */
public class OreHarmonic extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma0().multiply(n).mod(fs.sigma()).isZero();
  }

  @Override
  public boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma0().multiply(n).mod(fs.sigma()).isZero();
  }
}
