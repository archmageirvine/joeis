package irvine.oeis.a270;

import irvine.oeis.FiniteSequence;

/**
 * A270537 Numbers that are equal to their number of digits multiplied by the sum the cubes of the digits.
 * @author Georg Fischer
 */
public class A270537 extends FiniteSequence {

  /** Construct the sequence. */
  public A270537() {
    super(1, FINITE, 1, 2080, 2376, 2580, 3784);
  }
}
