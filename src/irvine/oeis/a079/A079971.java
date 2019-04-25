package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079971 Number of compositions (ordered partitions) of n into parts 1, 2, and 5.
 * @author Sean A. Irvine
 */
public class A079971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079971() {
    super(new long[] {1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5});
  }
}
