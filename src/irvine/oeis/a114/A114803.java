package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114803.
 * @author Sean A. Irvine
 */
public class A114803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114803() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {1, 3, 8, 12, 27, 27, 64, 48});
  }
}
