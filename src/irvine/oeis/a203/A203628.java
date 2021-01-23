package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203628 Indices of 9-gonal (nonagonal) numbers which are also 10-gonal (decagonal).
 * @author Sean A. Irvine
 */
public class A203628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203628() {
    super(new long[] {1, -899, 899}, new long[] {1, 589, 528601});
  }
}
