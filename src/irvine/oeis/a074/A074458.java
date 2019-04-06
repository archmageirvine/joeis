package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074458 Number of segments needed to be lit to display a number n in 7-segment LED display (i.e., digital number display, such as calculators).
 * @author Georg Fischer
 */
public class A074458 extends FiniteSequence {

  /** Construct the sequence. */
  public A074458() {
    super(6, 2, 5, 5, 4, 5, 6, 4, 7, 5);
  }
}
