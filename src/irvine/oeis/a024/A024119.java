package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024119 a(n) = 10^n - n^5.
 * @author Sean A. Irvine
 */
public class A024119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024119() {
    super(new long[] {10, -61, 156, -215, 170, -75, 16}, new long[] {1, 9, 68, 757, 8976, 96875, 992224});
  }
}
