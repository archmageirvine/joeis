package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052262 Partial sums of A014824.
 * @author Sean A. Irvine
 */
public class A052262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052262() {
    super(new long[] {-10, 31, -33, 13}, new long[] {0, 1, 13, 136});
  }
}
