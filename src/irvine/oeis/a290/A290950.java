package irvine.oeis.a290;

import irvine.oeis.FiniteSequence;

/**
 * A290950 Positive integers whose digits are in increasing order and whose successive digits differ by exactly 2.
 * @author Georg Fischer
 */
public class A290950 extends FiniteSequence {

  /** Construct the sequence. */
  public A290950() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 24, 35, 46, 57, 68, 79, 135, 246, 357, 468, 579, 1357, 2468, 3579, 13579);
  }
}
