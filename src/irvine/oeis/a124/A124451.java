package irvine.oeis.a124;

import irvine.oeis.FiniteSequence;

/**
 * A124451 Complete list of solutions to y^2 = x^3 + 17; sequence gives y values.
 * @author Georg Fischer
 */
public class A124451 extends FiniteSequence {

  /** Construct the sequence. */
  public A124451() {
    super(1, FINITE, 4, 3, 5, 9, 23, 282, 375, 378661);
  }
}
