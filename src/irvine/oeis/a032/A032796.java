package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032796 Numbers that are congruent to {1, 2, 3, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A032796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032796() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 5, 6, 8});
  }
}
