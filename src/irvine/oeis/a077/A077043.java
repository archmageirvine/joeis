package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077043 <code>"Three-quarter</code> squares": <code>a(n) = n^2 - A002620(n)</code>.
 * @author Sean A. Irvine
 */
public class A077043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077043() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 3, 7});
  }
}
