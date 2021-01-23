package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168585 Number of ways of partitioning the multiset {1,1,2,3,...,n-1} into exactly five nonempty parts.
 * @author Sean A. Irvine
 */
public class A168585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168585() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {1, 11, 90, 640, 4151});
  }
}
