package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162819 Positive numbers n such that 48*n/(48+n) are integers.
 * @author Georg Fischer
 */
public class A162819 extends FiniteSequence {

  /** Construct the sequence. */
  public A162819() {
    super(1, FINITE, 16, 24, 48, 80, 96, 144, 208, 240, 336, 528, 720, 1104, 2256);
  }
}
