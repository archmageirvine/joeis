package irvine.oeis.a002;

import irvine.oeis.FiniteSequence;

/**
 * A002271 Numbers m such that all odd numbers k, 1 &lt; k &lt; m, relatively prime to m are primes.
 * @author Sean A. Irvine
 */
public class A002271 extends FiniteSequence {

  /** Construct the sequence. */
  public A002271() {
    super(1, FINITE, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 21, 24, 30, 45, 105);
  }
}

