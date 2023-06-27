package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142705 Numerator of 1/4 - 1/(2n)^2.
 * @author Sean A. Irvine
 */
public class A142705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142705() {
    super(1, new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 3, 2, 15, 6, 35});
  }
}
