package irvine.oeis.a248;

import irvine.oeis.FiniteSequence;

/**
 * A248077 Least number k &gt; 0 such that k^k contains exactly n distinct digits.
 * @author Georg Fischer
 */
public class A248077 extends FiniteSequence {

  /** Construct the sequence. */
  public A248077() {
    super(1, 3, 4, 5, 7, 14, 9, 11, 13, 19);
  }
}
