package irvine.oeis.a129;

import irvine.oeis.FiniteSequence;

/**
 * A129616 10-digit numbers <code>d_1d_2...d_10</code> such that all the nine numbers <code>d_1...d_i + d_(i+1)...d_10 (0&lt;i&lt;10)</code> are primes.
 * @author Georg Fischer
 */
public class A129616 extends FiniteSequence {

  /** Construct the sequence. */
  public A129616() {
    super(1777137770L, 2240064227L, 2444402809L, 5753779594L, 6464886245L, 9151995592L);
  }
}
