package irvine.oeis.a270;

import irvine.oeis.FiniteSequence;

/**
 * A270542 Numbers of the form (pq)^2, where p is the number of digits of n (A055642) and q is the sum of the digits of n (A007953).
 * @author Georg Fischer
 */
public class A270542 extends FiniteSequence {

  /** Construct the sequence. */
  public A270542() {
    super(1, FINITE, 0, 1, 2704, 5184, 7744);
  }
}
