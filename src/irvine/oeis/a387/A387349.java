package irvine.oeis.a387;

import irvine.oeis.FilterPositionSequence;

/**
 * A387349 Positions of 0's in A387348.
 * @author Sean A. Irvine
 */
public class A387349 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A387349() {
    super(1, new A387348(), ZERO);
  }
}

