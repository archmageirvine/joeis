package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171809 Number of 5 X 5 permutation matrices such that the n-th matrix power is the identity matrix and the determinant is <code>-1</code>.
 * @author Georg Fischer
 */
public class A171809 extends FiniteSequence {

  /** Construct the sequence. */
  public A171809() {
    super(0, 10, 0, 30, 0, 20);
  }
}
