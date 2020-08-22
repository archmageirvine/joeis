package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028281 Distinct odd elements in 4-Pascal triangle A028275 (by row).
 * @author Sean A. Irvine
 */
public class A028281 extends DistinctSequence {

  /** Construct the sequence. */
  public A028281() {
    super(new A028277());
  }
}
