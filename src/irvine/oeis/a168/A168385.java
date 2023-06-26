package irvine.oeis.a168;

import irvine.oeis.FiniteSequence;

/**
 * A168385 Numbers of the form |a^b - c^d| where a, b, c and d are the first 4 primes.
 * @author Georg Fischer
 */
public class A168385 extends FiniteSequence {

  /** Construct the sequence. */
  public A168385() {
    super(1, FINITE, 3, 76, 115, 194, 311, 318, 2155, 2162, 16798, 16799, 78116, 78117);
  }
}
