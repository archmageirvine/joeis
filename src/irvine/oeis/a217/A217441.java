package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217441.
 * @author Sean A. Irvine
 */
public class A217441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217441() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 24, 28, 100, 108});
  }
}
