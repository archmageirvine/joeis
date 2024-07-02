package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A071143 Numbers n such that (i) the sum of the distinct primes dividing n is divisible by the largest prime dividing n and (ii) n has exactly 4 distinct prime factors and (iii) n is squarefree.
 * @author Sean A. Irvine
 */
public class A071143 extends FilterSequence {

  /** Construct the sequence. */
  public A071143() {
    super(1, new A071139(), k -> Predicates.SQUARE_FREE.is(k) && Functions.OMEGA.i(k) == 4);
  }
}
