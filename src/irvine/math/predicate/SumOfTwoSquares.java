package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is a sum of two squares.
 * @author Sean A. Irvine
 */
public class SumOfTwoSquares extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1 && p.mod(4) == 3) {
        return false;
      }
    }
    return true;
  }
}
