package irvine.oeis.a068;

import irvine.oeis.FilterPositionSequence;

/**
 * A068321 Numbers that are not the sum of arithmetic progressions of distinct primes including arithmetic progressions of length 1.
 * @author Sean A. Irvine
 */
public class A068321 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A068321() {
    super(1, 1, new A068320(), ZERO);
  }
}
