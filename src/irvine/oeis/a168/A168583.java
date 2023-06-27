package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168583 The number of ways of partitioning the multiset {1,1,2,3,...,n-1} into exactly three nonempty parts.
 * @author Sean A. Irvine
 */
public class A168583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168583() {
    super(3, new long[] {6, -11, 6}, new long[] {1, 4, 16});
  }
}
