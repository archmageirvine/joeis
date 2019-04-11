package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239056 Sum of the parts in the partitions of <code>4n</code> into 4 parts with smallest part <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A239056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239056() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {4, 32, 120, 304, 600, 1056, 1708, 2560});
  }
}
