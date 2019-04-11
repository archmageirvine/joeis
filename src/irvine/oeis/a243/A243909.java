package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243909 Least number <code>k &gt; 0</code> such that <code>2^k</code> contains exactly n different digits.
 * @author Georg Fischer
 */
public class A243909 extends FiniteSequence {

  /** Construct the sequence. */
  public A243909() {
    super(1, 4, 7, 10, 14, 21, 20, 37, 29, 68);
  }
}
