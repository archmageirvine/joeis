package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029092.
 * @author Sean A. Irvine
 */
public class A029092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029092() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 1, -1, 1, -1, 0, -1, 1, -1, 1, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 8, 9, 10, 11, 12, 14, 15, 17});
  }
}
