package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061319 Column 4 of A061315.
 * @author Sean A. Irvine
 */
public class A061319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061319() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 10, 76, 430, 1870, 6601, 19810, 52326});
  }
}
