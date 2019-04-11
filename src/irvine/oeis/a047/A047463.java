package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047463 Numbers that are congruent to <code>{2, 4} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047463() {
    super(new long[] {-1, 1, 1}, new long[] {2, 4, 10});
  }
}
