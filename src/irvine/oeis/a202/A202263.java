package irvine.oeis.a202;

import irvine.oeis.FiniteSequence;

/**
 * A202263 Primes in which all substrings and reversal substrings are primes.
 * @author Georg Fischer
 */
public class A202263 extends FiniteSequence {

  /** Construct the sequence. */
  public A202263() {
    super(1, FINITE, 2, 3, 5, 7, 37, 73, 373);
  }
}
