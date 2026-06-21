package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;

/**
 * A085493 Numbers k having partitions into distinct divisors of k + 1.
 * @author Sean A. Irvine
 */
public class A085493 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085493() {
    super(1, 1, new A085491().skip(), NONZERO);
  }
}
