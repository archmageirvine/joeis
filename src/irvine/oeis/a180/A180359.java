package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180359 n^9+9n.
 * @author Sean A. Irvine
 */
public class A180359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180359() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 10, 530, 19710, 262180, 1953170, 10077750, 40353670, 134217800, 387420570});
  }
}
