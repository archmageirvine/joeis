package irvine.oeis.a392;

import irvine.oeis.FilterPositionSequence;

/**
 * A392741 Positions of 0's in A392739.
 * @author Sean A. Irvine
 */
public class A392741 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A392741() {
    super(1, 0, new A392739(), ZERO);
  }
}
