package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021093 Decimal expansion of 1/89.
 * @author Sean A. Irvine
 */
public class A021093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021093() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 1, 2, 3, 5, 9, 5, 5, 0, 5, 6, 1, 7, 9, 7, 7, 5, 2, 8, 0, 8, 9});
  }
}
