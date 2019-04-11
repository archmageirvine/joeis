package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228141 Numbers that are congruent to <code>{1, 5} mod 20</code>.
 * @author Sean A. Irvine
 */
public class A228141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228141() {
    super(new long[] {-1, 1, 1}, new long[] {1, 5, 21});
  }
}
