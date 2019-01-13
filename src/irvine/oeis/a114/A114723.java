package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114723.
 * @author Sean A. Irvine
 */
public class A114723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114723() {
    super(new long[] {1, 3, 3, 1}, new long[] {0, 1, 1, 2});
  }
}
