package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154571 Numbers that are congruent to <code>{0, 3, 4, 5, 7, 8} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A154571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154571() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 3, 4, 5, 7, 8, 12});
  }
}
