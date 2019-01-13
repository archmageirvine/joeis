package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029310.
 * @author Sean A. Irvine
 */
public class A029310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029310() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 1, 1, 0, 2, 2, 0, 2, 2, 1, 2, 3, 2, 3, 4, 3, 4, 4, 4, 5, 5, 5, 7, 7});
  }
}
