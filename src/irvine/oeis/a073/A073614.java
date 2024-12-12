package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073614 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073614() {
    super(1, 1, new A000040(), (n, k) -> Predicates.SQUARE.is(k.add(1).multiply(n)));
  }
}
