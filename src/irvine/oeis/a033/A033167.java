package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a013.A013631;

/**
 * A033167 Positions of the incrementally largest terms in the continued fraction expansion of zeta(3), using the indexing of this continued fraction as given in A013631.
 * @author Sean A. Irvine
 */
public class A033167 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033167() {
    super(new A013631(), 1);
  }
}
