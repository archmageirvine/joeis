package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114040.
 * @author Sean A. Irvine
 */
public class A114040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114040() {
    super(new long[] {1, -7, 7}, new long[] {1, 9, 49});
  }
}
