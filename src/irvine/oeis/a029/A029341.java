package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029341.
 * @author Sean A. Irvine
 */
public class A029341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029341() {
    super(new long[] {-1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, -1, -2, -1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 0, 0, 1, 2, 2, 0, 1, 2, 3, 2, 1, 2, 4, 4, 4, 2, 4, 5, 6, 5, 4, 6});
  }
}
