package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056473 Number of palindromic structures using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056473() {
    super(1, new long[] {-24, 24, 26, -26, -9, 9, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
