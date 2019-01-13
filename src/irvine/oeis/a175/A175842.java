package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175842.
 * @author Sean A. Irvine
 */
public class A175842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175842() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 5, 7, 10, 14, 19, 25, 33, 42, 53, 66, 80, 97, 116});
  }
}
