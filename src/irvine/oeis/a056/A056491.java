package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056491 Number of periodic palindromes using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056491() {
    super(1, new long[] {120, -120, -154, 154, 71, -71, -14, 14, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 60, 120});
  }
}
