package irvine.oeis.a034;

import irvine.oeis.FilterPositionSequence;

/**
 * A034783 Numbers k such that A034693(k) = 6.
 * @author Sean A. Irvine
 */
public class A034783 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A034783() {
    super(1, new A034693(), 6);
  }
}
