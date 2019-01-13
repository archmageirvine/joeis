package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029032.
 * @author Sean A. Irvine
 */
public class A029032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029032() {
    super(new long[] {-1, 1, 0, 1, 0, 0, -1, -1, 0, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 4, 5, 6, 8, 10, 12, 14, 17});
  }
}
