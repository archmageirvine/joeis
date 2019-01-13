package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287497.
 * @author Sean A. Irvine
 */
public class A287497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287497() {
    super(new long[] {1, 0, -2, 3, 4, 1}, new long[] {1, 9, 22, 53, 166, 432});
  }
}
