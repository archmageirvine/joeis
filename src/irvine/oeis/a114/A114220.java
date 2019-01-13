package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114220.
 * @author Sean A. Irvine
 */
public class A114220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114220() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 0, 1, 1, 2});
  }
}
