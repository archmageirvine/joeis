package irvine.oeis.a107;

import irvine.oeis.FiniteSequence;

/**
 * A107081 Add <code>12, 3, 45, 67, 89 (note</code> the difference sequence uses each digit <code>once)</code>. Start with 1 for no particular reason; would seem more natural to start with 0.
 * @author Georg Fischer
 */
public class A107081 extends FiniteSequence {

  /** Construct the sequence. */
  public A107081() {
    super(1, 13, 16, 61, 128, 217);
  }
}
