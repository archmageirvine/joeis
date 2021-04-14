package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046624 Distinct odd numbers in the numerators of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046624 extends DistinctSequence {

  /** Construct the sequence. */
  public A046624() {
    super(new A046609());
  }
}
