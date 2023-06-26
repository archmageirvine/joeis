package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010385 Squares mod 23.
 * @author Sean A. Irvine
 */
public class A010385 extends FiniteSequence {

  /** Construct the sequence. */
  public A010385() {
    super(1, FINITE, 0, 1, 2, 3, 4, 6, 8, 9, 12, 13, 16, 18);
  }
}
