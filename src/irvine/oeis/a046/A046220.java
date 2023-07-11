package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046220 Distinct numbers in writing first numerator and then denominator of 1/2-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046220 extends DistinctSequence {

  /** Construct the sequence. */
  public A046220() {
    super(1, new A046213());
  }
}
