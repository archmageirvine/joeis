package irvine.oeis.a099;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A099576 Row sums of triangle A099575.
 * @author Georg Fischer
 */
public class A099576 extends RowSumSequence {

  /** Construct the sequence. */
  public A099576() {
    super(new A099575());
  }
}
