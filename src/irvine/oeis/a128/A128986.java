package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128986.
 * @author Sean A. Irvine
 */
public class A128986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128986() {
    super(new long[] {-81, 108, -54, 12}, new long[] {0, 36, 486, 3888});
  }
}
