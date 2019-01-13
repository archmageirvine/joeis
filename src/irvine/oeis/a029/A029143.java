package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029143.
 * @author Sean A. Irvine
 */
public class A029143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029143() {
    super(new long[] {-1, 0, 1, 1, 0, 0, 1, -1, -2, -1, 1, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 3, 2, 4, 4, 5, 6, 8, 7, 10, 11});
  }
}
