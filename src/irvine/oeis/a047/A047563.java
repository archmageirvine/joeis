package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047563 Numbers that are congruent to <code>{0, 3, 4, 5, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047563() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 3, 4, 5, 6, 7, 8});
  }
}
