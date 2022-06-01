package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180664 Golden Triangle sums: a(n) = a(n-1) + A001654(n+1) with a(0)=0.
 * @author Sean A. Irvine
 */
public class A180664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180664() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 2, 8, 23});
  }
}
