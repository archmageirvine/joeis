package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162689 Strictly positive numbers n such that <code>(18*n)/(18+n)</code> are integers.
 * @author Georg Fischer
 */
public class A162689 extends FiniteSequence {

  /** Construct the sequence. */
  public A162689() {
    super(9, 18, 36, 63, 90, 144, 306);
  }
}
