package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is triangular.
 * @author Sean A. Irvine
 */
class Triangular extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.shiftLeft(3).add(1).isSquare();
  }

  @Override
  public boolean is(final long n) {
    // WARNING this could overflow
    return Predicates.SQUARE.is((n << 3) + 1);
  }
}
