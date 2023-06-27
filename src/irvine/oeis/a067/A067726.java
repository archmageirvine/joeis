package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067726 a(n) = 6*n^2 + 12*n.
 * @author Sean A. Irvine
 */
public class A067726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067726() {
    super(1, new long[] {1, -3, 3}, new long[] {18, 48, 90});
  }
}
