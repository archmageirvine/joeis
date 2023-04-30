package irvine.oeis.a257;
// manually A257673/rowsums at 2023-04-29 13:57

import irvine.oeis.triangle.RowSumSequence;

/**
 * A257674 INVERT transform of planar partitions.
 * @author Georg Fischer
 */
public class A257674 extends RowSumSequence {

  /** Construct the sequence. */
  public A257674() {
    super(new A257673());
  }
}
