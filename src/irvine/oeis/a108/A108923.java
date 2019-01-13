package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108923.
 * @author Sean A. Irvine
 */
public class A108923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108923() {
    super(new long[] {1, -3, 3, -1, 0, 0, 0, 0, 1, -3, 3}, new long[] {1, 3, 6, 10, 15, 21, 28, 36, 44, 52, 60});
  }
}
