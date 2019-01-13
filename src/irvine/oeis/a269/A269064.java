package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269064.
 * @author Sean A. Irvine
 */
public class A269064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269064() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {0, 1, 4, 10, 26, 48, 87, 135});
  }
}
