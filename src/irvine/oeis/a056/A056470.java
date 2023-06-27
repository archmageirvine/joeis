package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056470 Number of palindromic structures using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056470() {
    super(1, new long[] {-30, 30, 31, -31, -10, 10, 1}, new long[] {1, 1, 2, 2, 5, 5, 15});
  }
}
