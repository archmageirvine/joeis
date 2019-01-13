package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029153.
 * @author Sean A. Irvine
 */
public class A029153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029153() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 1, 0, -1, -1, 1, 1, -1, -1, 0, 1, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 3, 1, 3, 3, 4, 3, 7, 4, 7, 7, 9, 7, 13, 9, 14});
  }
}
