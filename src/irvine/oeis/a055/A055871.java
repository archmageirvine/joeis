package irvine.oeis.a055;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A055871 Row sums of signed Fibonomial triangle A055870.
 * @author Georg Fischer
 */
public class A055871 extends RowSumSequence {

  /** Construct the sequence. */
  public A055871() {
    super(new A055870());
  }
}
