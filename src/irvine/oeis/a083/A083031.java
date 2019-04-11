package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083031 Numbers that are congruent to <code>{0, 3, 7} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A083031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083031() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 7, 12});
  }
}
