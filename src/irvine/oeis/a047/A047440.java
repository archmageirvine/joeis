package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047440 Numbers that are congruent to <code>{2, 5, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047440() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 5, 6, 10});
  }
}
