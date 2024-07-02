package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A071144 Numbers n such that sum of distinct primes dividing n is divisible by the largest prime dividing n. Also n has exactly 5 distinct prime factors and n is squarefree.
 * @author Sean A. Irvine
 */
public class A071144 extends FilterSequence {

  /** Construct the sequence. */
  public A071144() {
    super(1, new A071139(), k -> Predicates.SQUARE_FREE.is(k) && Functions.OMEGA.i(k) == 5);
  }
}
