package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055568 Numbers n such that sum of digits of n^2 is &gt;= n.
 * @author Georg Fischer
 */
public class A055568 extends FiniteSequence {

  /** Construct the sequence. */
  public A055568() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 17);
  }
}
