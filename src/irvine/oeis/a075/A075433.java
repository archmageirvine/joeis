package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075433 extends FilterSequence {

  /** Construct the sequence. */
  public A075433() {
    super(1, new A001597(), (n, k) -> n == 1 || Predicates.POWER.is(n));
  }
}
