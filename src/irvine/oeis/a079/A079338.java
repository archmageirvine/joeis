package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;

/**
 * A079101 A repetition-resistant sequence.
 * @author Sean A. Irvine
 */
public class A079338 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079338() {
    super(1, 1, new A079336(), ONE);
  }
}

