package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126633.
 * @author Sean A. Irvine
 */
public class A126633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126633() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {10, 94, 832, 6946, 54880, 412714});
  }
}
