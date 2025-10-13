package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162688 Strictly positive numbers k such that 12*k/(12+k) are integers.
 * @author Georg Fischer
 */
public class A162688 extends FiniteSequence {

  /** Construct the sequence. */
  public A162688() {
    super(1, FINITE, 4, 6, 12, 24, 36, 60, 132);
  }
}
