package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046559 Distinct even numbers in the numerators of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046559 extends DistinctSequence {

  /** Construct the sequence. */
  public A046559() {
    super(1, new A046558());
  }
}
