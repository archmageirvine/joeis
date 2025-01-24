package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074666 Differences between successive 8-digit distinct digit primes.
 * @author Sean A. Irvine
 */
public class A074666 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074666() {
    super(1, new A074665());
  }
}
