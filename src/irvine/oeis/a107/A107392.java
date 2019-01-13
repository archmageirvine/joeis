package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107392.
 * @author Sean A. Irvine
 */
public class A107392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107392() {
    super(new long[] {-8, 20, -18, 7}, new long[] {7, 31, 103, 303});
  }
}
