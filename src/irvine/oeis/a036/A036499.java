package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036499.
 * @author Sean A. Irvine
 */
public class A036499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036499() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 12, 15, 35});
  }
}
