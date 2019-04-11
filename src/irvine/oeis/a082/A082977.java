package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082977 Numbers that are congruent to <code>{0, 1, 3, 5, 6, 8, 10} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A082977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082977() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 6, 8, 10, 12});
  }
}
