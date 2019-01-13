package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101381.
 * @author Sean A. Irvine
 */
public class A101381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101381() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 30, 300, 1600, 5925, 17346});
  }
}
