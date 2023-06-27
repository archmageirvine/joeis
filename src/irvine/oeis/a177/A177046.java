package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177046 a(n) = 127*(n-1)-a(n-1) with n&gt;1, a(1)=16.
 * @author Sean A. Irvine
 */
public class A177046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177046() {
    super(1, new long[] {-1, 1, 1}, new long[] {16, 111, 143});
  }
}
