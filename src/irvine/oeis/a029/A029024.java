package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029024.
 * @author Sean A. Irvine
 */
public class A029024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029024() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 1, -1, -1, 1, 0, 1, -1, -1, 1, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 16, 19, 20, 23, 25, 28, 31});
  }
}
