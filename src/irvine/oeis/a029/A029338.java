package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029338.
 * @author Sean A. Irvine
 */
public class A029338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029338() {
    super(new long[] {-1, 0, 0, 0, 1, 1, 0, 0, 1, -1, 1, 0, -1, -1, -1, -1, 0, 1, -1, 1, 0, 0, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 0, 0, 2, 1, 2, 0, 2, 2, 2, 2, 3, 2, 4, 2, 6, 3, 4, 4, 7, 6, 6});
  }
}
