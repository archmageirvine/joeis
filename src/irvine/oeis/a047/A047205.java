package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047205 Numbers that are congruent to <code>{0, 3, 4} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A047205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047205() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 4, 5});
  }
}
