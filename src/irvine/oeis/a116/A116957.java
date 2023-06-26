package irvine.oeis.a116;

import irvine.oeis.FiniteSequence;

/**
 * A116957 Lynch-Bell numbers n such that 5 is a digit of n.
 * @author Georg Fischer
 */
public class A116957 extends FiniteSequence {

  /** Construct the sequence. */
  public A116957() {
    super(1, FINITE, 5, 15, 135, 175, 315, 735, 1395, 1935, 3195, 3915, 9135, 9315);
  }
}
