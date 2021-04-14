package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046589 Distinct even numbers in writing first numerator and then denominator of each element of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046589 extends DistinctSequence {

  /** Construct the sequence. */
  public A046589() {
    super(new A046587());
  }
}
