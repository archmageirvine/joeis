package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133386 Number of forests of labeled rooted trees with n nodes, containing exactly 2 trees of height one, all others having height zero.
 * @author Sean A. Irvine
 */
public class A133386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133386() {
    super(new long[] {216, -1188, 2826, -3815, 3222, -1767, 630, -141, 18}, new long[] {0, 0, 0, 0, 12, 120, 750, 3780, 16856});
  }
}
