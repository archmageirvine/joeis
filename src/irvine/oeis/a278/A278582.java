package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278582 Numbers n such that the Shimura subgroup Sigma(n) of the Jacobi variety J_0(n) has order 2.
 * @author Georg Fischer
 */
public class A278582 extends FiniteSequence {

  /** Construct the sequence. */
  public A278582() {
    super(1, FINITE, 20, 21, 24, 32, 48, 64, 72, 96, 100, 144, 147, 199, 288, 576);
  }
}
