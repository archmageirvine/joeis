package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278582 Numbers n such that the Shimura subgroup <code>Sigma(n)</code> of the Jacobi variety <code>J_0(n)</code> has order 2.
 * @author Georg Fischer
 */
public class A278582 extends FiniteSequence {

  /** Construct the sequence. */
  public A278582() {
    super(20, 21, 24, 32, 48, 64, 72, 96, 100, 144, 147, 199, 288, 576);
  }
}
