package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046560 Distinct numbers in writing first numerator and then denominator of each element to the right of the central elements of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046560 extends DistinctSequence {

  /** Construct the sequence. */
  public A046560() {
    super(new A046546());
  }
}
