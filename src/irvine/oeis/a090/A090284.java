package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090284.
 * @author Sean A. Irvine
 */
public class A090284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090284() {
    super(new long[] {1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1}, new long[] {4, 3, 2, 1, 1, 2, 3, 4, 3, 4, 4, 3, 2, 1, 1, 2, 2, 1, 1, 2, 3});
  }
}
