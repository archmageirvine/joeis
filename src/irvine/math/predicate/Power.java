package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a non-trivial power.
 * @author Sean A. Irvine
 */
class Power extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.isPower() != null;
  }
}
