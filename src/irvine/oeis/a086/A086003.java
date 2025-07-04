package irvine.oeis.a086;
// manually 2025-07-03

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A086003 Primes which remain prime after one and after two applications of the rotate-and-add operation of A086002.
 * @author Georg Fischer
 */
public class A086003 extends FilterSequence {

  /** Construct the sequence. */
  public A086003() {
    super(1, new A086002(), p -> Predicates.PRIME.is(A086002.rotAdd(A086002.rotAdd(p))));
  }

}
