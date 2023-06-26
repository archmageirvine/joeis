package irvine.oeis.a119;

import irvine.oeis.FiniteSequence;

/**
 * A119260 Numbers with even decimal digits in increasing order.
 * @author Georg Fischer
 */
public class A119260 extends FiniteSequence {

  /** Construct the sequence. */
  public A119260() {
    super(1, FINITE, 0, 2, 4, 6, 8, 24, 26, 28, 46, 48, 68, 246, 248, 268, 468, 2468);
  }
}
