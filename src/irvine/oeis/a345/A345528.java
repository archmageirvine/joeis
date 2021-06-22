package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345528 a(n) is the first prime that begins a sequence of exactly n consecutive primes that are emirps.
 * @author Sean A. Irvine
 */
public class A345528 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345528() {
    super(3, 7, 10);
  }
}
