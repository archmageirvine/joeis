package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130686 Absolute difference of final digits of two consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A130686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130686() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 6, 5, 4, 7, 2, 1, 0, 1, 2, 7, 4, 5, 6, 3, 2, 1, 0});
  }
}
