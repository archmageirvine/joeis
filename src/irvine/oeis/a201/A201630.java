package irvine.oeis.a201;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A201630 a(n) = a(n-1)+2*a(n-2) with n&gt;1, a(0)=2, a(1)=7.
 * @author Sean A. Irvine
 */
public class A201630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201630() {
    super(new long[] {2, 1}, new long[] {2, 7});
  }
}
