package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029096.
 * @author Sean A. Irvine
 */
public class A029096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029096() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 0, 1, 0, -1, 0, 0, -1, 0, 1, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16});
  }
}
