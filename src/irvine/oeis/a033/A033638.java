package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033638 Quarter-squares plus <code>1</code> (that is, <code>a(n) = A002620(n) + 1)</code>.
 * @author Sean A. Irvine
 */
public class A033638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033638() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 2, 3});
  }
}
