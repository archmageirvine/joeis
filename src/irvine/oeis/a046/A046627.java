package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046627 Distinct numbers in writing first numerator and then denominator of each element to the right of the central elements of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046627 extends DistinctSequence {

  /** Construct the sequence. */
  public A046627() {
    super(new A046613());
  }
}
