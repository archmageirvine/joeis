package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171059 <code>a(n)</code> is the lexically first sequence of distinct nonzero integers such that if <code>S(n)</code> is the string formed from the digits of <code>a(1)a(2)...a(n)</code>, then dividing <code>S(n)</code> into substrings with lengths equal to the successive digits of <code>S(n) (treating 0</code> as <code>10)</code> results in substrings beginning with the successive digits of <code>Pi (A000796)</code>.
 * @author Georg Fischer
 */
public class A171059 extends FiniteSequence {

  /** Construct the sequence. */
  public A171059() {
    super(3, 1, 2, 14, 4, 15, 5, 6, 7, 9, 8, 10, 26, 11, 12, 50, 13, 23, 16, 17, 25, 18, 19, 20, 80, 21, 22, 24, 29, 27, 28, 30, 37, 90, 31, 32, 33, 34, 35, 200, 36, 43, 84, 60, 201, 38, 61, 39, 40, 41, 42, 430, 53, 48, 44, 320, 45, 46, 79, 47, 49, 51, 52);
  }
}
