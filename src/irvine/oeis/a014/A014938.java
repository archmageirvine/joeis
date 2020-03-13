package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014938 <code>a(1)=1, a(n) = n*21^(n-1) + a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014938() {
    super(new long[] {441, -483, 43}, new long[] {1, 43, 1366});
  }
}
