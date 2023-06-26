package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162525 Partial sums of magic numbers A018226, divided by 2.
 * @author Georg Fischer
 */
public class A162525 extends FiniteSequence {

  /** Construct the sequence. */
  public A162525() {
    super(1, FINITE, 1, 5, 15, 29, 54, 95, 158);
  }
}
