package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046541 Distinct numbers seen when writing first numerator and then denominator of each element of 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046541 extends DistinctSequence {

  /** Construct the sequence. */
  public A046541() {
    super(1, new A046534());
  }
}
