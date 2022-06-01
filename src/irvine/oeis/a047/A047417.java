package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047417 Numbers that are congruent to {2, 3, 4, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047417() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 4, 6, 10});
  }
}
