package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a158.A158699;

/**
 * A085890 7-smooth numbers (A002473) using digits in descending order. Zero is followed by a 9.
 * @author Sean A. Irvine
 */
public class A085890 extends FilterSequence {

  /** Construct the sequence. */
  public A085890() {
    super(1, new A158699().skip(), k -> Predicates.SMOOTH.is(7, k));
  }
}
