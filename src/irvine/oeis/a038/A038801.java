package irvine.oeis.a038;

import irvine.oeis.PartialSumSequence;

/**
 * A038801 Number of primes less than 10n.
 * @author Sean A. Irvine
 */
public class A038801 extends PartialSumSequence {

  /** Construct the sequence. */
  public A038801() {
    super(new A038800());
  }
}
