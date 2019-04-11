package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047503 Numbers that are congruent to <code>{0, 2, 3, 4, 5, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047503() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 4, 5, 7, 8});
  }
}
