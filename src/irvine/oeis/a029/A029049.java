package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029049.
 * @author Sean A. Irvine
 */
public class A029049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029049() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 1, 0, -1, -1, 0, 1, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20});
  }
}
