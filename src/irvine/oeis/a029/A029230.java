package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029230.
 * @author Sean A. Irvine
 */
public class A029230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029230() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, -1, -1, 0, 0, 0, -1, -1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 2, 4, 3, 5, 4, 6, 5, 6, 6, 7, 7, 8, 9});
  }
}
