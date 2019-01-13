package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114948.
 * @author Sean A. Irvine
 */
public class A114948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114948() {
    super(new long[] {1, -3, 3}, new long[] {11, 14, 19});
  }
}
