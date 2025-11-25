package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a Sophie-Germain prime.
 * @author Sean A. Irvine
 */
class SophieGermain extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.isProbablePrime() && n.multiply2().add(1).isProbablePrime();
  }
}
