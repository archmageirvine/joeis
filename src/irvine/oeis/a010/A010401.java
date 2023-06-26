package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010401 Squares mod 40.
 * @author Sean A. Irvine
 */
public class A010401 extends FiniteSequence {

  /** Construct the sequence. */
  public A010401() {
    super(1, FINITE, 0, 1, 4, 9, 16, 20, 24, 25, 36);
  }
}
