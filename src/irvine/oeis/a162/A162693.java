package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162693 Strictly positive numbers n such that 30*n/(30+n) are integers.
 * @author Georg Fischer
 */
public class A162693 extends FiniteSequence {

  /** Construct the sequence. */
  public A162693() {
    super(1, FINITE, 6, 15, 20, 30, 45, 60, 70, 120, 150, 195, 270, 420, 870);
  }
}
