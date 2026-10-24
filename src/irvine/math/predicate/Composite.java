package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a composite: not 0, not 1 and not prime (see A002808).
 * @author Georg Fischer
 */
public class Composite extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.compareTo(Z.FOUR) > 0 && !Predicates.PRIME.is(n);
  }

  @Override
  public boolean is(final long n) {
    return n >= 4 && !Predicates.PRIME.is(n);
  }
}
