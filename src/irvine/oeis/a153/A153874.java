package irvine.oeis.a153;

import irvine.oeis.FiniteSequence;

/**
 * A153874 Numbers n = abc...k such that a^2*b^2*c^2*...k^2 - 1 = n.
 * @author Georg Fischer
 */
public class A153874 extends FiniteSequence {

  /** Construct the sequence. */
  public A153874() {
    super(1, FINITE, 143, 323, 11663);
  }
}
