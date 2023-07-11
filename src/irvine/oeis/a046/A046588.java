package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046588 Distinct numbers in writing first numerator and then denominator of each element to the right of the central elements of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046588 extends DistinctSequence {

  /** Construct the sequence. */
  public A046588() {
    super(1, new A046575());
  }
}
