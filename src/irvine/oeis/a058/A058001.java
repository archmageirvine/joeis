package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058001 Number of 3 X 3 matrices with entries mod n, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058001() {
    super(1, new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 36, 738, 8240, 57675, 289716, 1144836, 3780288, 10865205, 27969700});
  }
}
