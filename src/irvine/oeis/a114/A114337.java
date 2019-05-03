package irvine.oeis.a114;

import irvine.oeis.FiniteSequence;

/**
 * A114337 Primes which are 1/3 of the cumulative sum of factorials of primes, if 1 is used as the zeroth prime.
 * @author Georg Fischer
 */
public class A114337 extends FiniteSequence {

  /** Construct the sequence. */
  public A114337() {
    super(3, 43, 1723, 13307323);
  }
}
