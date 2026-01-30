package irvine.oeis.a083;

import irvine.oeis.FilterPositionSequence;

/**
 * A083476 Indices of terms of A083475 with a zero entry.
 * @author Sean A. Irvine
 */
public class A083476 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A083476() {
    super(1, 1, new A083475(), ZERO);
  }
}
