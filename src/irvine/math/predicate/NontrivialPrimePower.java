package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a nontrivial prime power.
 * @author Sean A. Irvine
 */
class NontrivialPrimePower extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    if (n.isProbablePrime()) {
      return false;
    }
    final Z t = n.isPower();
    return t != null && t.isProbablePrime();
  }
}
