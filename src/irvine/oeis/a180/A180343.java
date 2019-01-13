package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180343.
 * @author Sean A. Irvine
 */
public class A180343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180343() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {-4, -2, -3, -4, -3});
  }
}
