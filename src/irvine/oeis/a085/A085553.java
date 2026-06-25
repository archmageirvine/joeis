package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A085553 Lesser of twin primes of the form x^2+4, x^2+6.
 * @author Sean A. Irvine
 */
public class A085553 extends FilterSequence {

  /** Construct the sequence. */
  public A085553() {
    super(1, new A001359(), k -> Predicates.SQUARE.is(k.subtract(4)));
  }
}
