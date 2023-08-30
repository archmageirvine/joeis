package irvine.oeis.a185;

import irvine.oeis.FiniteSequence;

/**
 * A185092 Numbers k such that j^j == j^j^j (mod k) for every j.
 * @author Georg Fischer
 */
public class A185092 extends FiniteSequence {

  /** Construct the sequence. */
  public A185092() {
    super(1, FINITE, 1, 2, 3, 4, 6, 12);
  }
}
