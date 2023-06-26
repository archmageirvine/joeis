package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100894 a(n) = smallest n-digit prime formed by appending a digit to a(n-1); a(1) = 3.
 * @author Georg Fischer
 */
public class A100894 extends FiniteSequence {

  /** Construct the sequence. */
  public A100894() {
    super(1, FINITE, 3, 31, 311, 3119, 31193);
  }
}
