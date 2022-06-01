package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215005 a(n) = a(n-2) + a(n-1) + floor(n/2) + 1 for n &gt; 1 and a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A215005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215005() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {0, 1, 3, 6, 12});
  }
}
