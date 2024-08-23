package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is a St\u00f8rmer number.
 * @author Sean A. Irvine
 */
class Stormer extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final Z lim = n.multiply2();
    final FactorSequence fs = Jaguar.factor(n.square().add(1));
    for (final Z p : fs.toZArray()) {
      if (p.compareTo(lim) >= 0) {
        return true;
      }
    }
    return false;
  }
}
