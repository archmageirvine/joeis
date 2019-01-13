package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114210.
 * @author Sean A. Irvine
 */
public class A114210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114210() {
    super(new long[] {1, 1, -2, -3, 0, 3, 2, -1}, new long[] {0, 1, 1, 3, 4, 7, 8, 14});
  }
}
