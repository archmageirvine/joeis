package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060107 Numbers that are congruent to {0, 2, 3, 5, 7, 8, 10} mod 12. The ivory keys on a piano, start with A0 = the 0th key.
 * @author Sean A. Irvine
 */
public class A060107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060107() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 7, 8, 10, 12});
  }
}
