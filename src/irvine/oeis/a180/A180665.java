package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180665 Golden Triangle sums: a(n)=a(n-2)+A001654(n) with a(0)=0 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A180665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180665() {
    super(new long[] {1, -2, -3, 3, 2}, new long[] {0, 1, 2, 7, 17});
  }
}
