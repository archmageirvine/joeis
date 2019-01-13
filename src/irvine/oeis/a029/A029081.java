package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029081.
 * @author Sean A. Irvine
 */
public class A029081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029081() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 0, 0, 1, -1, 1, -1, -1, 1, -1, 1, 0, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10, 11, 12, 14, 15, 17, 18, 20});
  }
}
