package irvine.oeis.a081;

import irvine.oeis.NoncomputableSequence;

/**
 * A081419 Largest value held in any register at the end of a halting computation by an n-instruction register Minsky machine.
 * @author Sean A. Irvine
 */
public class A081419 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A081419() {
    // The proposed value at n=9 is a lower bound, not an exact term.
    super(1, NONCOMPUTABLE, 0, 1, 2, 3, 4, 6, 9, 34);
  }
}
