package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029279.
 * @author Sean A. Irvine
 */
public class A029279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029279() {
    super(new long[] {-1, 0, 0, 1, 0, 1, 0, 1, -1, 0, 0, 0, -1, -1, 0, 0, 0, -1, 1, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 3, 1, 2, 3, 2, 4, 3, 4, 4, 4, 7, 5, 6, 7, 7});
  }
}
