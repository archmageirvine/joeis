package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181303.
 * @author Sean A. Irvine
 */
public class A181303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181303() {
    super(new long[] {-7, 7, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6});
  }
}
