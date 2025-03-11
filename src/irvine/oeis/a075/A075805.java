package irvine.oeis.a075;

import irvine.oeis.DifferenceSequence;

/**
 * A075805 Differences between adjacent palindromic numbers which are products of an even number of distinct primes.
 * @author Sean A. Irvine
 */
public class A075805 extends DifferenceSequence {

  /** Construct the sequence. */
  public A075805() {
    super(1, new A075799());
  }
}
