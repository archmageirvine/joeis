package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058001 Number of <code>3 X 3</code> matrices with entries mod n, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058001() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 36, 738, 8240, 57675, 289716, 1144836, 3780288, 10865205, 27969700});
  }
}
