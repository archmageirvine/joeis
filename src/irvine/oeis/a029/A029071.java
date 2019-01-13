package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029071.
 * @author Sean A. Irvine
 */
public class A029071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029071() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 1, -1, 0, 1, -2, 1, 0, -1, 1, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 6, 8, 9, 10, 11, 13, 14, 17, 18});
  }
}
