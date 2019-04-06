package irvine.oeis.a241;

import irvine.oeis.FiniteSequence;

/**
 * A241899 Numbers n equal to the sum of all the two-digit numbers formed without repetition from the digits of n.
 * @author Georg Fischer
 */
public class A241899 extends FiniteSequence {

  /** Construct the sequence. */
  public A241899() {
    super(11, 22, 33, 44, 55, 66, 77, 88, 99, 132, 264, 396);
  }
}
