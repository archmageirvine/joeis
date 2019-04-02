package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249736 Triangular numbers modulo 30.
 * @author Sean A. Irvine
 */
public class A249736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249736() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 3, 6, 10, 15, 21, 28, 6, 15, 25, 6, 18, 1, 15, 0, 16, 3, 21, 10, 0, 21, 13, 6, 0, 25, 21, 18, 16, 15, 15, 16, 18, 21, 25, 0, 6, 13, 21, 0, 10, 21, 3, 16, 0});
  }
}
