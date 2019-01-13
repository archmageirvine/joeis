package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029043.
 * @author Sean A. Irvine
 */
public class A029043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029043() {
    super(new long[] {-1, 1, 0, 1, -1, 1, -1, 0, -1, 1, 0, 1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 9, 10, 11, 13, 15, 17, 19, 21, 23});
  }
}
