package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047467 Numbers that are congruent to <code>{0, 2} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047467() {
    super(new long[] {-1, 1, 1}, new long[] {0, 2, 8});
  }
}
