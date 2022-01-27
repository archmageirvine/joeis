package irvine.oeis.a094;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A094616 Row sums of A094615.
 * @author Georg Fischer
 */
public class A094616 extends RowSumSequence {

  /** Construct the sequence. */
  public A094616() {
    super(new A094615());
  }
}
