package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114481.
 * @author Sean A. Irvine
 */
public class A114481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114481() {
    super(new long[] {108, -108, 27}, new long[] {5, 105, 2331});
  }
}
