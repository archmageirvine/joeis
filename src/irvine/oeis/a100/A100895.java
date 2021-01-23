package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100895 a(n) = smallest n-digit prime formed by appending a digit to a(n-1); a(1) = 7.
 * @author Georg Fischer
 */
public class A100895 extends FiniteSequence {

  /** Construct the sequence. */
  public A100895() {
    super(7, 71, 719, 7193, 71933, 719333);
  }
}
