package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029036.
 * @author Sean A. Irvine
 */
public class A029036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029036() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 0, -1, 1, 0, 1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 3, 4, 5, 6, 7, 9, 10, 12, 14, 16, 18, 21, 23});
  }
}
