package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199403.
 * @author Sean A. Irvine
 */
public class A199403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199403() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {1, 0, 3, 6, 13});
  }
}
