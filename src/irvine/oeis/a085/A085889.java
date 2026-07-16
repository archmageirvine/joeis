package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a059.A059043;

/**
 * A085889 7-smooth numbers (A002473) using digits in increasing order. 9 is followed by a zero.
 * @author Sean A. Irvine
 */
public class A085889 extends FilterSequence {

  /** Construct the sequence. */
  public A085889() {
    super(1, new A059043().skip(), k -> Predicates.SMOOTH.is(7, k));
  }
}
