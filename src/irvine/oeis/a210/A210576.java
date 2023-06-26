package irvine.oeis.a210;

import irvine.oeis.FiniteSequence;

/**
 * A210576 Positive integers that cannot be expressed as sum of one or more nontrivial binomial coefficients.
 * @author Georg Fischer
 */
public class A210576 extends FiniteSequence {

  /** Construct the sequence. */
  public A210576() {
    super(1, FINITE, 1, 2, 3, 4, 5, 7, 8, 9, 11, 13, 14, 17, 19, 23, 29);
  }
}
