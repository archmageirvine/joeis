package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146509 Numbers that are congruent to <code>{1, 5} mod 18</code>.
 * @author Sean A. Irvine
 */
public class A146509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146509() {
    super(new long[] {-1, 1, 1}, new long[] {1, 5, 19});
  }
}
