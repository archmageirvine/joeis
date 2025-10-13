package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162689 Strictly positive numbers k such that (18*k)/(18+k) are integers.
 * @author Georg Fischer
 */
public class A162689 extends FiniteSequence {

  /** Construct the sequence. */
  public A162689() {
    super(1, FINITE, 9, 18, 36, 63, 90, 144, 306);
  }
}
