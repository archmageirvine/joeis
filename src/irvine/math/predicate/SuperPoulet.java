package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Test if a number is a Super-Poulet number.
 * @author Sean A. Irvine
 */
class SuperPoulet extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    if (n.isProbablePrime()) {
      return false;
    }
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (Z.ONE.equals(d)) {
        continue;
      }
      if (!Z.TWO.modPow(d, d).equals(Z.TWO)) {
        return false;
      }
    }
    return true;
  }
}
