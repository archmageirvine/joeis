package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090771 Numbers that are congruent to {1, 9} mod 10.
 * @author Sean A. Irvine
 */
public class A090771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090771() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 9, 11});
  }
}
