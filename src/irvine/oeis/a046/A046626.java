package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046626 Distinct even numbers in the numerators of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046626 extends DistinctSequence {

  /** Construct the sequence. */
  public A046626() {
    super(new A046625());
  }
}
