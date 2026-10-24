package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a Chen prime: primes <code>p</code> such that <code>p + 2</code> is either a prime or a semiprime (see A109611).
 * @author Georg Fischer
 */
public class ChenPrime extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    if (Predicates.PRIME.is(n)) {
      final Z p2 = n.add(2); 
      return Predicates.PRIME.is(p2) || Predicates.SEMIPRIME.is(p2);
    } else {
      return false;
    } 
  }

  @Override
  public boolean is(final long n) {
    return is(Z.valueOf(n));
  }
}
