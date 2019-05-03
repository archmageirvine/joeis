package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180664 Golden Triangle sums: <code>a(n)=a(n-1)+A001654(n+1)</code> with <code>a(0)=0</code>.
 * @author Sean A. Irvine
 */
public class A180664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180664() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 2, 8, 23});
  }
}
