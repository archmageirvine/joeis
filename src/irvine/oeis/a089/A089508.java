package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089508 Solution to a binomial problem together with companion sequence A081016(n-1).
 * @author Sean A. Irvine
 */
public class A089508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089508() {
    super(1, new long[] {1, -8, 8}, new long[] {1, 14, 103});
  }
}
