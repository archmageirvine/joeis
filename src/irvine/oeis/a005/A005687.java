package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005687.
 * @author Sean A. Irvine
 */
public class A005687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005687() {
    super(new long[] {-1, 0, 0, 0, -2, 2, 1, -2, 0, 2}, new long[] {1, 2, 4, 6, 9, 14, 22, 36, 57, 90});
  }
}

