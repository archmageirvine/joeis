package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029082.
 * @author Sean A. Irvine
 */
public class A029082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029082() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 0, 0, 1, -1, 0, 1, -2, 1, 0, -1, 1, 0, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 6, 7, 7, 7, 9, 10, 11, 11, 13, 15, 16, 16, 19, 21});
  }
}
