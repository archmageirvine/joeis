package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036627 Number of 4-ary rooted trees with n nodes and height exactly 3.
 * @author Georg Fischer
 */
public class A036627 extends FiniteSequence {

  /** Construct the sequence. */
  public A036627() {
    super(0, 0, 0, 1, 2, 4, 6, 8, 9, 11, 11, 12, 11, 11, 9, 8, 6, 5, 3, 2, 1, 1);
  }
}
