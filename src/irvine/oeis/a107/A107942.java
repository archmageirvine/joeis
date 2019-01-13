package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107942.
 * @author Sean A. Irvine
 */
public class A107942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107942() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 28, 300, 1925, 8918, 32928, 102816, 282150, 698775, 1591876});
  }
}
