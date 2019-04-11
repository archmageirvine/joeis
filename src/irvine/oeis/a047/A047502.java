package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047502 Numbers that are congruent to <code>{2, 3, 4, 5, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047502() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 3, 4, 5, 7, 10});
  }
}
