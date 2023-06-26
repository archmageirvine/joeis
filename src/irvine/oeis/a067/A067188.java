package irvine.oeis.a067;

import irvine.oeis.FiniteSequence;

/**
 * A067188 Numbers that can be expressed as the (unordered) sum of two primes in exactly two ways.
 * @author Georg Fischer
 */
public class A067188 extends FiniteSequence {

  /** Construct the sequence. */
  public A067188() {
    super(1, FINITE, 10, 14, 16, 18, 20, 28, 32, 38, 68);
  }
}
