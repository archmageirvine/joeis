package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072682 Numbers congruent to {3, 36, 54, 57} mod 60.
 * @author Sean A. Irvine
 */
public class A072682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072682() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 36, 54, 57, 63});
  }
}
