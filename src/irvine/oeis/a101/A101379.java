package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101379.
 * @author Sean A. Irvine
 */
public class A101379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101379() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 27, 256, 1325, 4815, 13916});
  }
}
