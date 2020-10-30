package irvine.oeis.a036;

import irvine.oeis.PartialSumSequence;

/**
 * A036389 Number of (odd and even) split numbers (A036382) below 2^n.
 * @author Sean A. Irvine
 */
public class A036389 extends PartialSumSequence {

  /** Construct the sequence. */
  public A036389() {
    super(new A036385());
  }
}
