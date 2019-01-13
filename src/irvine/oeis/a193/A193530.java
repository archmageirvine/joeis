package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193530.
 * @author Sean A. Irvine
 */
public class A193530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193530() {
    super(new long[] {1, 1, -1, 3, -7, 1, 3}, new long[] {1, 1, 2, 3, 7, 13, 31});
  }
}
