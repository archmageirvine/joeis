package irvine.oeis.a387;

import irvine.oeis.FilterPositionSequence;

/**
 * A387350 Positions of 1's in A387348.
 * @author Sean A. Irvine
 */
public class A387350 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A387350() {
    super(1, new A387348(), ONE);
  }
}

