package irvine.oeis.a229;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a013.A013631;

/**
 * A229055 Positions of the incrementally largest terms in the continued fraction for <code>zeta(3)</code>.
 * @author Sean A. Irvine
 */
public class A229055 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A229055() {
    super(new A013631(), 0);
  }
}
