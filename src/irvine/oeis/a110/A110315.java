package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110315.
 * @author Sean A. Irvine
 */
public class A110315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110315() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, -1, -1, -2, -5, -3});
  }
}
