package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056471 Number of palindromic structures using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056471() {
    super(new long[] {144, -144, -180, 180, 80, -80, -15, 15, 1}, new long[] {1, 1, 2, 2, 5, 5, 15, 15, 52});
  }
}
