package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is powerful (see A001694).
 * @author Georg Fischer
 */
public class Powerful extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z f : fs.toZArray()) {
      if (fs.getExponent(f) == 1) {
        return false;
      }
    }
    return true;
  }
}
