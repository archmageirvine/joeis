package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244604 Least number k such that <code>k^n</code> contains the digit <code>n n</code> times.
 * @author Georg Fischer
 */
public class A244604 extends FiniteSequence {

  /** Construct the sequence. */
  public A244604() {
    super(1, 1, 15, 179, 261, 435, 426, 1083, 2169, 2137);
  }
}
