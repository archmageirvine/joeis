package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238705 Number of partitions of 4n into 4 parts with smallest part = 1.
 * @author Sean A. Irvine
 */
public class A238705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238705() {
    super(1, new long[] {1, -2, 1, -1, 2}, new long[] {1, 4, 10, 19, 30});
  }
}
