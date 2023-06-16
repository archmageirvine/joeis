package irvine.oeis.a208;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A208658 Row sums of A208657.
 * @author Georg Fischer
 */
public class A208658 extends RowSumSequence {

  /** Construct the sequence. */
  public A208658() {
    super(1, new A208657());
  }
}
