package irvine.oeis.a002;

import irvine.oeis.FiniteSequence;

/**
 * A002271 All odd numbers <code>k, 1 &lt; k &lt; n,</code> relatively prime to n are primes.
 * @author Sean A. Irvine
 */
public class A002271 extends FiniteSequence {

  /** Construct the sequence. */
  public A002271() {
    super(2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 21, 24, 30, 45, 105);
  }
}

