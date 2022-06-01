package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114481 Kekul\u00e9 numbers for certain benzenoids.
 * @author Sean A. Irvine
 */
public class A114481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114481() {
    super(new long[] {108, -108, 27}, new long[] {5, 105, 2331});
  }
}
