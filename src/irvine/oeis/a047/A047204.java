package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047204 Numbers that are congruent to <code>{3, 4} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A047204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047204() {
    super(new long[] {-1, 1, 1}, new long[] {3, 4, 8});
  }
}
