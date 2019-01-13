package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179111.
 * @author Sean A. Irvine
 */
public class A179111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179111() {
    super(new long[] {1, 0, -2, 1, 0, 0, 0, 0, 0, 0, -1, 0, 2}, new long[] {0, 0, 0, 0, 0, 0, 1, 2, 4, 7, 12, 20, 33});
  }
}
