package irvine.oeis.a258;

import irvine.oeis.FiniteSequence;

/**
 * A258692 Integers n such that n*(n + 2)*(n + 4) + 1 is a perfect square.
 * @author Georg Fischer
 */
public class A258692 extends FiniteSequence {

  /** Construct the sequence. */
  public A258692() {
    super(1, FINITE, -4, -3, -2, 0, 1, 2, 8, 10, 18, 112, 1272);
  }
}
