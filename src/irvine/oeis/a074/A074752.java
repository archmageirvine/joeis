package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074752 Number of combinatorially inequivalent cyclic subgroups of <code>S_n</code> of order 6. Number of partitions of n of order 6.
 * @author Sean A. Irvine
 */
public class A074752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074752() {
    super(new long[] {-1, 1, 1, 0, -1, -1, 2, -1, -1, 0, 1, 1}, new long[] {1, 2, 3, 5, 7, 9, 12, 16, 19, 24, 29, 34});
  }
}
