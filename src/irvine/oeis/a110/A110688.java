package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110688.
 * @author Sean A. Irvine
 */
public class A110688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110688() {
    super(new long[] {-6, -12, -20, -17, -7}, new long[] {-1, 1, -4, 19, -73});
  }
}
