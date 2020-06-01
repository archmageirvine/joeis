package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074145 <code>a(1) = 1;</code> for <code>n&gt;1, a(n)</code> is the smallest previously unused natural number such that <code>a(n)</code> divides the sum of next <code>a(n)</code> terms.
 * @author Georg Fischer
 */
public class A074145 extends FiniteSequence {

  /** Construct the sequence. */
  public A074145() {
    super(1, 2, 3, 5, 4, 6, 7, 8, 15, 9, 10, 11, 12, 19, 13, 23, 14, 16, 17, 18, 27, 20, 30, 31, 24, 21, 22, 36, 25, 26, 37, 28, 47, 39, 29, 33, 32, 51, 44, 34, 35, 56, 38, 40, 41, 42, 63, 48);
  }
}
