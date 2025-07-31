package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;

/**
 * A079136 Positions of 0 in the repetition-resistant sequence A079101.
 * @author Sean A. Irvine
 */
public class A079136 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079136() {
    super(1, new A079101(), ZERO);
  }
}

