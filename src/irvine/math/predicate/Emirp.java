package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is an emirp.
 * @author Sean A. Irvine
 */
class Emirp extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    if (!n.isProbablePrime()) {
      return false;
    }
    final Z r = Functions.REVERSE.z(n);
    return !r.equals(n) && r.isProbablePrime();
  }
}
