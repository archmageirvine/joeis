package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074459 Number of segments needed to be changed to display from a number n to the next number n+1 in 7-segment LED display (i.e., digital number display, such as calculators).
 * @author Georg Fischer
 */
public class A074459 extends FiniteSequence {

  /** Construct the sequence. */
  public A074459() {
    super(4, 5, 2, 3, 3, 1, 4, 3, 2);
  }
}
