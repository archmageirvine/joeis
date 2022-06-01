package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047250 Numbers that are congruent to {0, 3, 4, 5} (mod 6).
 * @author Sean A. Irvine
 */
public class A047250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047250() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 4, 5, 6});
  }
}
