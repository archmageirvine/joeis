package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110660.
 * @author Sean A. Irvine
 */
public class A110660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110660() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 2, 2, 6});
  }
}
