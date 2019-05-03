package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128624 Row sums of <code>A128623</code>.
 * @author Sean A. Irvine
 */
public class A128624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128624() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 4, 12, 24, 45, 72});
  }
}
