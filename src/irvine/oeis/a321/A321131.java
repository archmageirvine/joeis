package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321131 Values of m (mod 25), where A317905(m) = 1. Values of m (mod 25) such that V(m) = 1, where V(m) indicates the constant convergence speed of the tetration base m.
 * @author Georg Fischer
 */
public class A321131 extends FiniteSequence {

  /** Construct the sequence. */
  public A321131() {
    super(2, 3, 4, 6, 8, 9, 11, 12, 13, 14, 16, 17, 19, 21, 22, 23);
  }
}
