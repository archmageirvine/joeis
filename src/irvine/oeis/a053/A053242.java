package irvine.oeis.a053;

import irvine.oeis.FilterPositionSequence;

/**
 * A053242 Numbers n such that A053238(n) = 1.
 * @author Sean A. Irvine
 */
public class A053242 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A053242() {
    super(1, new A053238(), 1);
  }
}
