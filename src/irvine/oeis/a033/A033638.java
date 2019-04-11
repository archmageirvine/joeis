package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033638 Quarter-squares plus 1 (that is, <code>a(n) =</code> A002620(n) <code>+ 1)</code>.
 * @author Sean A. Irvine
 */
public class A033638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033638() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 2, 3});
  }
}
