package irvine.oeis.a052;

import irvine.oeis.FiniteSequence;

/**
 * A052025 Every prefix (or suffix) of palindromic prime a(n) is prime (right/left-truncatable).
 * @author Georg Fischer
 */
public class A052025 extends FiniteSequence {

  /** Construct the sequence. */
  public A052025() {
    super(1, FINITE, 2, 3, 5, 7, 313, 373, 797);
  }
}
