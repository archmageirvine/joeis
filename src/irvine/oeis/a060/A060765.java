package irvine.oeis.a060;

import irvine.oeis.FilterPositionSequence;

/**
 * A060765 Numbers n such that every difference between consecutive divisors (ordered by increasing magnitude) of n is also a divisor of n.
 * @author Sean A. Irvine
 */
public class A060765 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A060765() {
    super(1, new A060763(), ZERO);
  }
}
