package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;

/**
 * A079338 Positions of 1 in the repetition-resistant sequence A079336.
 * @author Sean A. Irvine
 */
public class A079338 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079338() {
    super(1, 1, new A079336(), ONE);
  }
}

