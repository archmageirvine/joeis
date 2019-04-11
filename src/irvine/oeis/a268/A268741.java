package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268741 <code>a(n) = 2*a(n - 2) - a(n - 1)</code> for <code>n&gt;1, a(0) = 4, a(1) = 5</code>.
 * @author Sean A. Irvine
 */
public class A268741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268741() {
    super(new long[] {2, -1}, new long[] {4, 5});
  }
}
