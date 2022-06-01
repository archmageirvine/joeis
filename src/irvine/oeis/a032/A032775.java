package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032775 Numbers that are congruent to {0, 1, 2, 3, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A032775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032775() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 5, 6, 7});
  }
}
