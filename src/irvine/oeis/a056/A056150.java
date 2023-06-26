package irvine.oeis.a056;

import irvine.oeis.FiniteSequence;

/**
 * A056150 Number of combinations for each possible sum when throwing 3 (normal) dice.
 * @author Georg Fischer
 */
public class A056150 extends FiniteSequence {

  /** Construct the sequence. */
  public A056150() {
    super(3, FINITE, 1, 3, 6, 10, 15, 21, 25, 27, 27, 25, 21, 15, 10, 6, 3, 1);
  }
}
