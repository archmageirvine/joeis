package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;

/**
 * A079101 A repetition-resistant sequence.
 * @author Sean A. Irvine
 */
public class A079337 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079337() {
    super(1, 1, new A079336(), ZERO);
  }
}

