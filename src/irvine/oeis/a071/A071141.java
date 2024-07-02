package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A071141 Numbers n such that sum of distinct primes dividing n is divisible by the largest prime dividing n. Also n is neither a prime, nor a true power of prime and n is squarefree. Squarefree solutions of A071140.
 * @author Sean A. Irvine
 */
public class A071141 extends FilterSequence {

  /** Construct the sequence. */
  public A071141() {
    super(1, new A071140(), Predicates.SQUARE_FREE::is);
  }
}
