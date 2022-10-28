package irvine.oeis.a053;

import irvine.oeis.FilterPositionSequence;

/**
 * A053243 Numbers n such that A053238(n) = 3.
 * @author Sean A. Irvine
 */
public class A053243 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A053243() {
    super(1, new A053238(), 3);
  }
}
