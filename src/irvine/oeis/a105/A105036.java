package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105036 <code>a(0) = 0, a(1) = 4, a(2) = 8, a(3) = 116</code>, for <code>n&gt;3 a(n) = 26*a(n-2) - a(n-4) + 12</code>.
 * @author Sean A. Irvine
 */
public class A105036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105036() {
    super(new long[] {1, -1, -26, 26, 1}, new long[] {0, 4, 8, 116, 220});
  }
}
