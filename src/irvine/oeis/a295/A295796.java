package irvine.oeis.a295;

import irvine.oeis.FiniteSequence;

/**
 * A295796 The only integers that cannot be partitioned into a sum of seven positive squares.
 * @author Georg Fischer
 */
public class A295796 extends FiniteSequence {

  /** Construct the sequence. */
  public A295796() {
    super(1, FINITE, 0, 1, 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 17, 20);
  }
}
