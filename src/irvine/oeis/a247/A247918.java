package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247918.
 * @author Sean A. Irvine
 */
public class A247918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247918() {
    super(new long[] {-1, 2, -2, 2, -1, 1, -1, 1}, new long[] {1, 1, 0, 0, 0, 1, 1, 0});
  }
}
