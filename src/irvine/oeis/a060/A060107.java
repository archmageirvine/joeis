package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060107 Numbers that are congruent to <code>{0, 2, 3, 5, 7, 8, 10} mod 12</code>. The ivory keys on a piano, start with <code>A0 =</code> the <code>0th</code> key.
 * @author Sean A. Irvine
 */
public class A060107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060107() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 7, 8, 10, 12});
  }
}
