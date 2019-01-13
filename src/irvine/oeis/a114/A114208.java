package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114208.
 * @author Sean A. Irvine
 */
public class A114208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114208() {
    super(new long[] {1, 1, -2, -3, 0, 3, 2, -1}, new long[] {1, 0, 3, 2, 6, 6, 12, 10});
  }
}
