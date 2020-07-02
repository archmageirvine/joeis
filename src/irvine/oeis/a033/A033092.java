package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a002.A002852;

/**
 * A033092 Positions of incrementally largest terms in the continued fraction for Euler's constant gamma <code>(A002852)</code>.
 * @author Sean A. Irvine
 */
public class A033092 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033092() {
    super(new A002852(), 1);
  }
}
