package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114242.
 * @author Sean A. Irvine
 */
public class A114242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114242() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 14, 90, 385, 1274, 3528, 8568, 18810});
  }
}
