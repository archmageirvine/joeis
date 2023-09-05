package irvine.oeis.a065;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a001.A001358;

/**
 * A065516 Differences between products of 2 primes.
 * @author Sean A. Irvine
 */
public class A065516 extends DifferenceSequence {

  /** Construct the sequence. */
  public A065516() {
    super(1, new A001358());
  }
}
