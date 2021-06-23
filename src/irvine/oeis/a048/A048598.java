package irvine.oeis.a048;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001097;

/**
 * A048598 Partial sums of the sequence (A001097) of twin primes.
 * @author Sean A. Irvine
 */
public class A048598 extends PartialSumSequence {

  /** Construct the sequence. */
  public A048598() {
    super(new A001097());
  }
}

