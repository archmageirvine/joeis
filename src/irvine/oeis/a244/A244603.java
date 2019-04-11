package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244603 Least number k such that n^k contains the digit <code>n n</code> times.
 * @author Georg Fischer
 */
public class A244603 extends FiniteSequence {

  /** Construct the sequence. */
  public A244603() {
    super(1, 18, 21, 32, 30, 38, 33, 55, 69);
  }
}
