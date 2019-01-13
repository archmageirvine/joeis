package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029302.
 * @author Sean A. Irvine
 */
public class A029302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029302() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, -1, 0, -1, -1, 0, -1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 2, 0, 0, 3, 0, 1, 4, 0, 1, 5, 0, 2, 7, 0, 3, 8, 1, 4, 10, 1, 5, 12, 2});
  }
}
