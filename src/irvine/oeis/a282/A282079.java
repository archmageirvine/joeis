package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282079 Number of n-element subsets of [n+2] having an even sum.
 * @author Sean A. Irvine
 */
public class A282079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282079() {
    super(new long[] {1, -3, 5, -7, 7, -5, 3}, new long[] {1, 1, 2, 6, 9, 9, 12});
  }
}
