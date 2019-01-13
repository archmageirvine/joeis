package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029040.
 * @author Sean A. Irvine
 */
public class A029040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029040() {
    super(new long[] {-1, 1, 0, 1, -1, 1, -1, 0, 0, 0, 0, -1, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 3, 4, 4, 6, 7, 8, 10, 11, 13, 15, 17, 20});
  }
}
