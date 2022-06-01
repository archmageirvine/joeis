package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215008 a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3), a(0)=0, a(1)=1, a(2)=5.
 * @author Sean A. Irvine
 */
public class A215008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215008() {
    super(new long[] {7, -14, 7}, new long[] {0, 1, 5});
  }
}
