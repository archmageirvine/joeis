package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050492 Thickened cube numbers: a(n) = n*(n^2 + (n-1)^2) + (n-1)*2*n*(n-1).
 * @author Sean A. Irvine
 */
public class A050492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050492() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 14, 63, 172});
  }
}
