package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046570 Distinct numbers in writing first numerator and then denominator of each element of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046570 extends DistinctSequence {

  /** Construct the sequence. */
  public A046570() {
    super(new A046563());
  }
}
