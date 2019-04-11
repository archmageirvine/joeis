package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228137 Numbers that are congruent to <code>{1, 4} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A228137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228137() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 13});
  }
}
