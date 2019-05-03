package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203628 Indices of <code>9-gonal</code> (nonagonal) numbers which are also <code>10-gonal</code> (decagonal).
 * @author Sean A. Irvine
 */
public class A203628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203628() {
    super(new long[] {1, -899, 899}, new long[] {1, 589, 528601});
  }
}
