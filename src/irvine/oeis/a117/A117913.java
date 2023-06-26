package irvine.oeis.a117;

import irvine.oeis.FiniteSequence;

/**
 * A117913 Lynch-Bell numbers whose digits are all odd.
 * @author Georg Fischer
 */
public class A117913 extends FiniteSequence {

  /** Construct the sequence. */
  public A117913() {
    super(1, FINITE, 1, 3, 5, 7, 9, 15, 135, 175, 315, 735, 1395, 1935, 3195, 3915, 9135, 9315);
  }
}
