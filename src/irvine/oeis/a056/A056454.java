package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056454 Number of palindromes of length n using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056454() {
    super(1, new long[] {6, -6, -5, 5, 1}, new long[] {0, 0, 0, 0, 6});
  }
}
