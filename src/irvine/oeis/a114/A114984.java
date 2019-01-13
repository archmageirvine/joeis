package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114984.
 * @author Sean A. Irvine
 */
public class A114984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114984() {
    super(new long[] {-1, 1, 1}, new long[] {200, 199, 442});
  }
}
