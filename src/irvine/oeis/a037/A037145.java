package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037145.
 * @author Sean A. Irvine
 */
public class A037145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037145() {
    super(new long[] {1, 0, -1, -1, -1, 0, 0, 2, 2, 1, 0, -1, -2, -2, 0, 0, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 2, 4, 3, 6, 6, 9, 9, 14, 13, 19, 20, 26, 27, 36, 36});
  }
}
