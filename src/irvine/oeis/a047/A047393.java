package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047393 Numbers that are congruent to {0, 1} mod 8.
 * @author Sean A. Irvine
 */
public class A047393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047393() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 8});
  }
}
