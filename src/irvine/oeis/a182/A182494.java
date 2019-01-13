package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182494.
 * @author Sean A. Irvine
 */
public class A182494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182494() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {9, 1, 8, 1, 9, 0, 0});
  }
}
