package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070359.
 * @author Sean A. Irvine
 */
public class A070359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070359() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 9, 27, 13, 5, 15, 11, 33});
  }
}
