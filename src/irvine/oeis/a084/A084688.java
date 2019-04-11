package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084688 Nonnegative integers n such that <code>2^n</code> uses only distinct decimal digits.
 * @author Georg Fischer
 */
public class A084688 extends FiniteSequence {

  /** Construct the sequence. */
  public A084688() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 29);
  }
}
