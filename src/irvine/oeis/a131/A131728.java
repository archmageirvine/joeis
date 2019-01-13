package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131728.
 * @author Sean A. Irvine
 */
public class A131728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131728() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, 1, 0, 1, 3});
  }
}
