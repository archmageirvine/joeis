package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a013.A013631;

/**
 * A033167 Positions of the incrementally largest terms in the continued fraction expansion of zeta(3), offset 1 variant.
 * @author Sean A. Irvine
 */
public class A033167 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033167() {
    super(1, new A013631(), 1);
  }
}
