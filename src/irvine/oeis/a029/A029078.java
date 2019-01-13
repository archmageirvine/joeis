package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029078.
 * @author Sean A. Irvine
 */
public class A029078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029078() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 4, 5, 5, 5, 7, 8, 8, 8, 11, 13, 14, 14, 17, 19});
  }
}
