package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037500.
 * @author Sean A. Irvine
 */
public class A037500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037500() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 7, 51, 358});
  }
}
