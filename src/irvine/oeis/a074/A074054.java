package irvine.oeis.a074;

import irvine.oeis.FilterPositionSequence;

/**
 * A074054 Numbers n such that sum of composites from smallest prime factor of n to largest prime factor of n is prime.
 * @author Sean A. Irvine
 */
public class A074054 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074054() {
    super(1, 1, new A074037(), PRIME);
  }
}
