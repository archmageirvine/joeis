package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321130 Values of m (mod 25) such that V(m) &gt;= 2, where V(m) indicates the constant convergence speed of the tetration base m.
 * @author Georg Fischer
 */
public class A321130 extends FiniteSequence {

  /** Construct the sequence. */
  public A321130() {
    super(0, 1, 5, 7, 15, 18, 24);
  }
}
