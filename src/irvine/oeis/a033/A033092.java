package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a002.A002852;

/**
 * A033092 Positions of incrementally largest terms in the continued fraction for Euler's constant gamma (A002852).
 * @author Sean A. Irvine
 */
public class A033092 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033092() {
    super(0, new A002852(), 1);
  }
}
