package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090570 Numbers that are congruent to {0, 1} mod 9.
 * @author Sean A. Irvine
 */
public class A090570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090570() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 9});
  }
}
