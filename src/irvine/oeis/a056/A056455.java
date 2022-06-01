package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056455 Palindromes using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056455() {
    super(new long[] {-24, 24, 26, -26, -9, 9, 1}, new long[] {0, 0, 0, 0, 0, 0, 24});
  }
}
