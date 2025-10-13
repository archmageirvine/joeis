package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162690 Strictly positive numbers k such that 20*k/(20+k) are integers.
 * @author Georg Fischer
 */
public class A162690 extends FiniteSequence {

  /** Construct the sequence. */
  public A162690() {
    super(1, FINITE, 5, 20, 30, 60, 80, 180, 380);
  }
}
