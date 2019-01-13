package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072561.
 * @author Sean A. Irvine
 */
public class A072561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072561() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 4, 6, 7, 9, 10, 12, 13, 15, 19});
  }
}
