package irvine.oeis.a086;
// manually 2025-07-03

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A086004 Primes which remain prime after one and after two and after three applications of the rotate-and-add operation of A086002.
 * @author Georg Fischer
 */
public class A086004 extends FilterSequence {

  /** Construct the sequence. */
  public A086004() {
    super(1, new A086003(), p -> Predicates.PRIME.is(A086002.rotAdd(A086002.rotAdd(A086002.rotAdd(p)))));
  }
}
