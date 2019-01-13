package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272129.
 * @author Sean A. Irvine
 */
public class A272129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272129() {
    super(new long[] {1, -3, 3}, new long[] {25, 1, 41});
  }
}
