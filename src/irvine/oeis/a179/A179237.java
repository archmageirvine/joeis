package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179237 <code>a(0) = 1, a(1) = 2; a(n+1) = 6*a(n) + a(n-1)</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A179237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179237() {
    super(new long[] {1, 6}, new long[] {1, 2});
  }
}
