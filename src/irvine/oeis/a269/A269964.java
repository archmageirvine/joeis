package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269964.
 * @author Sean A. Irvine
 */
public class A269964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269964() {
    super(new long[] {-2, 0, 4, -3, -1, 3}, new long[] {1, 1, 3, 5, 11, 23});
  }
}
