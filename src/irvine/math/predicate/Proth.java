package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a Proth number.
 * @author Sean A. Irvine
 */
public class Proth extends AbstractPredicate {

  // isproth(x)={!bittest(x--, 0) && (x>>valuation(x+!x, 2))^2 < x }

  @Override
  public boolean is(final Z n) {
    if (n.isEven()) {
      return false;
    }
    final Z m = n.subtract(1);
    return m.shiftRight(m.makeOdd().auxiliary()).square().compareTo(m) < 0;
  }

  @Override
  public boolean is(final long n) {
    return is(Z.valueOf(n));
  }
}
