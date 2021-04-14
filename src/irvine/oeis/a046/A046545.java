package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046545 Distinct numbers in writing first numerator and then denominator of the central elements of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046545 extends DistinctSequence {

  /** Construct the sequence. */
  public A046545() {
    super(new A046543());
  }
}
