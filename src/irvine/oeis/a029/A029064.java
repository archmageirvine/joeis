package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029064.
 * @author Sean A. Irvine
 */
public class A029064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029064() {
    super(new long[] {-1, 1, 0, 0, 1, 0, -1, 1, -1, -1, 1, -1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 10, 11, 13, 15, 17});
  }
}
