package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;

/**
 * A079337 Positions of 0 in the repetition-resistant sequence A079336.
 * @author Sean A. Irvine
 */
public class A079337 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079337() {
    super(1, 1, new A079336(), ZERO);
  }
}

