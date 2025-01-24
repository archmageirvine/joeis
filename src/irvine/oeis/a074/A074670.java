package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074670 Differences between successive six-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074670 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074670() {
    super(1, new A074669());
  }
}
