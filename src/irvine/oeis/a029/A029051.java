package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029051.
 * @author Sean A. Irvine
 */
public class A029051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029051() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 1, -1, 0, 0, 0, 0, -1, 1, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 7, 7, 8, 10, 11, 12, 14, 16, 17, 19, 22});
  }
}
