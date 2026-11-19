package irvine.oeis.a350;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A350915 Number of weakly connected oriented graphs with n arcs.
 * @author Gregory Morse
 */
public class A350915 extends RowSumSequence {
  /** Construct the sequence. */
  public A350915() {
    super(new A350914());
  }
}
