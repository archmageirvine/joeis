package irvine.oeis.a083;

import irvine.oeis.FilterPositionSequence;

/**
 * A083476 Positions of 0's in A083475.
 * @author Sean A. Irvine
 */
public class A083476 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A083476() {
    super(1, 1, new A083475(), ZERO);
  }
}
