package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029093.
 * @author Sean A. Irvine
 */
public class A029093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029093() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 1, -1, 0, 1, -1, -1, 1, 0, -1, 1, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 5, 5, 6, 6, 7, 9, 9, 11, 11, 12, 15, 16, 18});
  }
}
