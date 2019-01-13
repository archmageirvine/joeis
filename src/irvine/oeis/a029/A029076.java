package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029076.
 * @author Sean A. Irvine
 */
public class A029076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029076() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 1, -1, 0, 0, 0, 0, 0, 0, -1, 1, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 6, 7, 7, 8, 10, 11, 11, 13, 15, 16, 17, 20});
  }
}
