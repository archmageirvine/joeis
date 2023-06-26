package irvine.oeis.a125;

import irvine.oeis.FiniteSequence;

/**
 * A125573 a(n) = number of n-digit terms with different sets of decimal digits in A108571.
 * @author Georg Fischer
 */
public class A125573 extends FiniteSequence {

  /** Construct the sequence. */
  public A125573() {
    super(1, FINITE, 1, 1, 2, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 15, 17, 18, 19, 21, 21, 22, 23, 23, 23, 23, 22, 21, 21, 19, 18, 17, 15, 13, 12, 10, 9, 8, 6, 5, 4, 3, 2, 2, 1, 1, 1);
  }
}
