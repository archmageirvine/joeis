package irvine.oeis.a062;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a051.A051801;

/**
 * A062372 Numbers the product of whose nonzero digits is a cube.
 * @author Sean A. Irvine
 */
public class A062372 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062372() {
    super(0, 1, new A051801().skip(1), n -> Predicates.CUBE.is(n));
  }
}
