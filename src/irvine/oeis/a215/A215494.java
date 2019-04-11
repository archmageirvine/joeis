package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215494 <code>a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3)</code> with <code>a(1)=7, a(2)=21, a(3)=70</code>.
 * @author Sean A. Irvine
 */
public class A215494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215494() {
    super(new long[] {7, -14, 7}, new long[] {7, 21, 70});
  }
}
