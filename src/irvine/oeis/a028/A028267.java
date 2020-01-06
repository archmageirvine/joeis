package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028267 Number of distinct elements in 3-Pascal triangle <code>A028262</code> (by row).
 * @author Sean A. Irvine
 */
public class A028267 extends DistinctSequence {

  /** Construct the sequence. */
  public A028267() {
    super(new A028262());
  }
}
