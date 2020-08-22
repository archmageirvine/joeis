package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171806 Number of 5 X 5 permutation matrices such that the n-th matrix power is the least nonnegative power that gives the identity matrix.
 * @author Georg Fischer
 */
public class A171806 extends FiniteSequence {

  /** Construct the sequence. */
  public A171806() {
    super(1, 25, 20, 30, 24, 20);
  }
}

