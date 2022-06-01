package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259278 Number of compositions of n into parts 1, 6, and 7.
 * @author Sean A. Irvine
 */
public class A259278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259278() {
    super(new long[] {1, 1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 2});
  }
}
