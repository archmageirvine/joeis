package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168584 Number of ways of partitioning the multiset {1,1,2,3,...,n-1} into exactly four nonempty parts.
 * @author Sean A. Irvine
 */
public class A168584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168584() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 7, 41, 215});
  }
}
