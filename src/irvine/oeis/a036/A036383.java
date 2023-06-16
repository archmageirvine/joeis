package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;

/**
 * A036383 First differences of odd split numbers (A036382).
 * @author Sean A. Irvine
 */
public class A036383 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036383() {
    super(1, new A036382());
  }
}
