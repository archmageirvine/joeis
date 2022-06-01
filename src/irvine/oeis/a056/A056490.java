package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056490 Number of periodic palindromes using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056490() {
    super(new long[] {-24, 24, 26, -26, -9, 9, 1}, new long[] {0, 0, 0, 0, 0, 12, 24});
  }
}
