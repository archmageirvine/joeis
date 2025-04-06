package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Test if a number is powerful (see A001694).
 * @author Georg Fischer
 */
public class Powerful extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return Z.ONE.equals(n) || Jaguar.factor(n).minExponent() > 1;
  }
}
