package irvine.oeis.a287;

import irvine.oeis.FiniteSequence;

/**
 * A287642 Positive integers k such that, for each prime p with k/2 &lt;= p &lt;= k - 2, k - p is prime.
 * @author Georg Fischer
 */
public class A287642 extends FiniteSequence {

  /** Construct the sequence. */
  public A287642() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 8, 10, 12, 14, 16, 18, 24, 30, 36, 42, 48, 60, 90, 210);
  }
}
