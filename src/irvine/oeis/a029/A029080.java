package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029080.
 * @author Sean A. Irvine
 */
public class A029080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029080() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 12, 13, 15, 16, 18, 19});
  }
}
