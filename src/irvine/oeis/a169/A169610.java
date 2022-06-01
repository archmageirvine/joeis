package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169610 Numbers that are congruent to {5, 30} mod 37.
 * @author Sean A. Irvine
 */
public class A169610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169610() {
    super(new long[] {-1, 1, 1}, new long[] {5, 30, 42});
  }
}
