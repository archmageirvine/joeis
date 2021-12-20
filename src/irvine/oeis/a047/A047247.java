package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047247 Numbers that are congruent to {2, 3, 4, 5} (mod 6).
 * @author Sean A. Irvine
 */
public class A047247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047247() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 4, 5, 8});
  }
}
