package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029056.
 * @author Sean A. Irvine
 */
public class A029056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029056() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 0, 1, -1, 0, 0, 0, 0, -1, 1, 0, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 7, 8, 8, 10, 11, 12, 14, 15, 17, 19, 20, 23});
  }
}
