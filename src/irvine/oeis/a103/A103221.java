package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103221 Number of partitions of n into parts 2 and 3.
 * @author Sean A. Irvine
 */
public class A103221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103221() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1});
  }
}
