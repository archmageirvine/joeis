package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171550 Numbers n with property that decimal expansion of <code>2^n+3^n</code> contains no pair of neighbor equal digits (probably finite).
 * @author Georg Fischer
 */
public class A171550 extends FiniteSequence {

  /** Construct the sequence. */
  public A171550() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 17, 22, 23, 26, 27, 29, 45, 52, 73);
  }
}
