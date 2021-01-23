package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028280 Distinct elements in 4-Pascal triangle A028275 (by row).
 * @author Sean A. Irvine
 */
public class A028280 extends DistinctSequence {

  /** Construct the sequence. */
  public A028280() {
    super(new A028275());
  }
}
