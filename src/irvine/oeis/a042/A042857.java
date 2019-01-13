package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042857.
 * @author Sean A. Irvine
 */
public class A042857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042857() {
    super(new long[] {-1, 0, 0, 0, 1920, 0, 0, 0}, new long[] {1, 1, 30, 31, 1890, 1921, 57599, 59520});
  }
}
