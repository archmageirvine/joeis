package irvine.oeis.a080;

import irvine.oeis.FilterSequence;

/**
 * A080160 Squares that are digit sums of Wonderful Demlo numbers A002477.
 * @author Sean A. Irvine
 */
public class A080160 extends FilterSequence {

  /** Construct the sequence. */
  public A080160() {
    super(1, new A080151(), SQUARE);
  }
}
