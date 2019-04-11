package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151977 Numbers that are congruent to <code>{0, 1} mod 16</code>.
 * @author Sean A. Irvine
 */
public class A151977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151977() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 16});
  }
}
