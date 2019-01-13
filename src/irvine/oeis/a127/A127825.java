package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127825.
 * @author Sean A. Irvine
 */
public class A127825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127825() {
    super(new long[] {1, -2, 0, 1, 1, 0, -3, 3, 0, -1, -1, 0, 2}, new long[] {1, 0, 2, 2, 4, 5, 11, 11, 20, 25, 35, 44, 63});
  }
}
