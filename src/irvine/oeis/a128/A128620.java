package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128620 Row sums of <code>A128619</code>.
 * @author Sean A. Irvine
 */
public class A128620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128620() {
    super(new long[] {1, 1, -4, -3, 4, 1}, new long[] {1, 1, 4, 6, 15, 24});
  }
}
