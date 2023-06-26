package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243909 Least number k &gt; 0 such that 2^k contains exactly n different digits.
 * @author Georg Fischer
 */
public class A243909 extends FiniteSequence {

  /** Construct the sequence. */
  public A243909() {
    super(1, FINITE, 1, 4, 7, 10, 14, 21, 20, 37, 29, 68);
  }
}
