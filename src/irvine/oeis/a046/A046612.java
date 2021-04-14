package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046612 Distinct numbers in writing first numerator and then denominator of the central elements of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046612 extends DistinctSequence {

  /** Construct the sequence. */
  public A046612() {
    super(new A046611());
  }
}
