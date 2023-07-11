package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046574 Distinct numbers in writing first numerator and then denominator of the central elements of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046574 extends DistinctSequence {

  /** Construct the sequence. */
  public A046574() {
    super(1, new A046572());
  }
}
