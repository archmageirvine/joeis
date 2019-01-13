package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272071.
 * @author Sean A. Irvine
 */
public class A272071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272071() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 1, 2});
  }
}
