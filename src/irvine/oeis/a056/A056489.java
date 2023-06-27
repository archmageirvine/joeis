package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056489 Number of periodic palindromes using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056489() {
    super(1, new long[] {6, -6, -5, 5, 1}, new long[] {0, 0, 0, 3, 6});
  }
}
