package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001097;

/**
 * A085555 Primes p of the form x^2+4, such that either p-2 or p+2 is prime.
 * @author Sean A. Irvine
 */
public class A085555 extends FilterSequence {

  /** Construct the sequence. */
  public A085555() {
    super(1, new A001097(), k -> Predicates.SQUARE.is(k.subtract(4)));
  }
}
