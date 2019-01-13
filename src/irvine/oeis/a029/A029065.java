package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029065.
 * @author Sean A. Irvine
 */
public class A029065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029065() {
    super(new long[] {-1, 1, 0, 0, 1, 0, -1, 0, 1, -2, 1, 0, -1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 3, 3, 5, 6, 7, 7, 9, 11, 12, 13, 16, 18});
  }
}
