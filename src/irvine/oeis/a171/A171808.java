package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171808 Number of <code>5 X 5</code> permutation matrices such that the n-th matrix power is the identity matrix and the determinant is <code>+1</code>.
 * @author Georg Fischer
 */
public class A171808 extends FiniteSequence {

  /** Construct the sequence. */
  public A171808() {
    super(1, 15, 20, 0, 24);
  }
}
