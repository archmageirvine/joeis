package irvine.oeis.a367;

import irvine.oeis.FiniteSequence;

/**
 * A367070 Numbers k such that k = (product of nonzero digits) * (sum of digits) for the digits of k in base 7.
 * @author Sean A. Irvine
 */
public class A367070 extends FiniteSequence {

  /** Construct the sequence. */
  public A367070() {
    super(1, FINITE, 1, 16, 128, 250, 480, 864, 21600, 62208, 73728);
  }
}
