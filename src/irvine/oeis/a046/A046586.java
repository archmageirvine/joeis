package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046586 Distinct odd numbers in the numerators of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046586 extends DistinctSequence {

  /** Construct the sequence. */
  public A046586() {
    super(1, new A046571());
  }
}
