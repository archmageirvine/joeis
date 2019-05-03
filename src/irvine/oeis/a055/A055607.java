package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055607 <code>a(2n+1) = n^2 - 1 + A002620(n), a(2n) = a(2n-1) +</code> n.
 * @author Sean A. Irvine
 */
public class A055607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055607() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 0, 2, 4, 7, 10, 14});
  }
}
