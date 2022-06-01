package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056456 Number of palindromes of length n using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056456() {
    super(new long[] {120, -120, -154, 154, 71, -71, -14, 14, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 120});
  }
}
