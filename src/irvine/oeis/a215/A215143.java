package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215143 a(n) = 7*a(n-1) -14*a(n-2) +7*a(n-3), with a(0)=1, a(1)=2, a(2)=7.
 * @author Sean A. Irvine
 */
public class A215143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215143() {
    super(new long[] {7, -14, 7}, new long[] {1, 2, 7});
  }
}
