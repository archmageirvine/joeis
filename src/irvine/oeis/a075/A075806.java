package irvine.oeis.a075;

import irvine.oeis.DifferenceSequence;

/**
 * A075806 Differences between adjacent palindromic numbers which are products of an odd number of distinct primes.
 * @author Sean A. Irvine
 */
public class A075806 extends DifferenceSequence {

  /** Construct the sequence. */
  public A075806() {
    super(1, new A075800());
  }
}
