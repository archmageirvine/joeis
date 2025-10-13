package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162692 Strictly positive numbers k such that 28*k/(28+k) are integers.
 * @author Georg Fischer
 */
public class A162692 extends FiniteSequence {

  /** Construct the sequence. */
  public A162692() {
    super(1, FINITE, 21, 28, 70, 84, 168, 364, 756);
  }
}
