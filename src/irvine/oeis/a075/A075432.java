package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075432 extends FilterSequence {

  /** Construct the sequence. */
  public A075432() {
    super(new A000040(), p -> !Predicates.SQUARE_FREE.is(p.subtract(1)) && !Predicates.SQUARE_FREE.is(p.add(1)));
  }
}
