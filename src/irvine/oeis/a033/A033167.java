package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a013.A013631;

/**
 * A033167 Positions of the incrementally largest terms in the continued fraction for zeta(3) (indexing a(0) as a(1)).
 * @author Sean A. Irvine
 */
public class A033167 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033167() {
    super(new A013631(), 1);
  }
}
