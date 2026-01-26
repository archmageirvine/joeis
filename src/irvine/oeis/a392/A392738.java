package irvine.oeis.a392;

import irvine.oeis.FilterPositionSequence;

/**
 * A392738 Positions of 0's in A392736.
 * @author Sean A. Irvine
 */
public class A392738 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A392738() {
    super(1, 0, new A392736(), ZERO);
  }
}
