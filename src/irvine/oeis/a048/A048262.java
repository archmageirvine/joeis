package irvine.oeis.a048;

import irvine.oeis.FiniteSequence;

/**
 * A048262 Numbers that aren&apos;t the sum of distinct primes of the form 4n+3.
 * @author Georg Fischer
 */
public class A048262 extends FiniteSequence {

  /** Construct the sequence. */
  public A048262() {
    super(1, 2, 4, 5, 6, 8, 9, 12, 13, 15, 16, 17, 20, 24, 25, 27, 28, 32, 35, 36, 39, 48, 51, 55);
  }
}
