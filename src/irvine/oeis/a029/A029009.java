package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029009.
 * @author Sean A. Irvine
 */
public class A029009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029009() {
    super(new long[] {-1, 1, 1, -1, 1, -1, -1, 1, 0, 1, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 2, 2, 4, 4, 6, 6, 9, 10, 13, 14, 18, 20, 24, 26});
  }
}
