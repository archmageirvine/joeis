package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046608 Distinct numbers in writing first numerator and then denominator of each element of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046608 extends DistinctSequence {

  /** Construct the sequence. */
  public A046608() {
    super(1, new A046601());
  }
}
