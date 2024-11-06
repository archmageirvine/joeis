package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Test if a number is a semiprime.
 * @author Sean A. Irvine
 */
class Semiprime extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return Jaguar.factorAllowIncomplete(n).isSemiprime();
  }
}
