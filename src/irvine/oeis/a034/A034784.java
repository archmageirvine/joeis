package irvine.oeis.a034;

import irvine.oeis.FilterPositionSequence;

/**
 * A034784 Numbers n such that A034693(n) = 2.
 * @author Sean A. Irvine
 */
public class A034784 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A034784() {
    super(1, new A034693(), 2);
  }
}
