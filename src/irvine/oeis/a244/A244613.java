package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244613 Least number k &gt; 0 such that 2^k ends in exactly n consecutive increasing digits.
 * @author Georg Fischer
 */
public class A244613 extends FiniteSequence {

  /** Construct the sequence. */
  public A244613() {
    super(1, 8, 28, 328, 1328, 11328);
  }
}
