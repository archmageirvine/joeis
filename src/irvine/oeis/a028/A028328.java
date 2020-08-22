package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028328 Distinct elements in the even-Pascal triangle A028326.
 * @author Sean A. Irvine
 */
public class A028328 extends DistinctSequence {

  /** Construct the sequence. */
  public A028328() {
    super(new A028326());
  }
}
