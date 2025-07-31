package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;

/**
 * A079335 Positions of 1 in the repetition-resistant sequence A079101.
 * @author Sean A. Irvine
 */
public class A079335 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079335() {
    super(1, new A079101(), ONE);
  }
}

