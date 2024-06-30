package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a prime power.
 * @author Sean A. Irvine
 */
class PrimePower extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    if (n.isProbablePrime()) {
      return true;
    }
    final Z t = n.isPower();
    return t != null && t.isProbablePrime();
  }
}
