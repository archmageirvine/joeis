package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029272.
 * @author Sean A. Irvine
 */
public class A029272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029272() {
    super(new long[] {-1, 0, 0, 1, 0, 1, 1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 2, 1, 1, 2, 2, 2, 4, 3, 3, 5, 4, 5, 7, 6, 7});
  }
}
