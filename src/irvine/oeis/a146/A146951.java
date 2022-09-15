package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146951 Numbers that are congruent to 0 or 6 mod 10.
 * @author Sean A. Irvine
 */
public class A146951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146951() {
    super(new long[] {-1, 1, 1}, new long[] {0, 6, 10});
  }
}
