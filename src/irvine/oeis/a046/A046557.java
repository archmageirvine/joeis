package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046557 Distinct odd numbers in the numerators of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046557 extends DistinctSequence {

  /** Construct the sequence. */
  public A046557() {
    super(new A046542());
  }
}
