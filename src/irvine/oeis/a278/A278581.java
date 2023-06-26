package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278581 Numbers n such that the Shimura subgroup Sigma(n) of the Jacobi variety J_0(n) has order 1.
 * @author Georg Fischer
 */
public class A278581 extends FiniteSequence {

  /** Construct the sequence. */
  public A278581() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 16, 18, 25, 36, 49, 50, 169);
  }
}
