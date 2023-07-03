package irvine.oeis.a229;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a013.A013631;

/**
 * A229055 Positions of the incrementally largest terms in the continued fraction expansion of zeta(3).
 * @author Sean A. Irvine
 */
public class A229055 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A229055() {
    super(1, new A013631(), 0);
  }
}
