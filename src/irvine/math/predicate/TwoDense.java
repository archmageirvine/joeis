package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Test if a number is 2-dense.
 * @author Sean A. Irvine
 */
public class TwoDense extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    Z t = Z.ONE;
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (t.multiply2().compareTo(d) < 0) {
        return false;
      }
      t = d;
    }
    return true;
  }

  @Override
  public boolean is(final long n) {
    return is(Z.valueOf(n));
  }
}
