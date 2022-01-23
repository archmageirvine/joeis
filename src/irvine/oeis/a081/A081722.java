package irvine.oeis.a081;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A081722 Row sums of triangle in A081720.
 * @author Georg Fischer
 */
public class A081722 extends RowSumSequence {

  /** Construct the sequence. */
  public A081722() {
    super(new A081720());
  }
}
