package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244552 Palindromes n such that n +/- the sum of digits of n are both palindromes.
 * @author Georg Fischer
 */
public class A244552 extends FiniteSequence {

  /** Construct the sequence. */
  public A244552() {
    super(1, 2, 3, 4, 181, 262, 343, 424, 767, 848, 929);
  }
}
