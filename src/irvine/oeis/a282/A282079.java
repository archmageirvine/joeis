package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282079 Number of n-element subsets of <code>[n+2]</code> having an even sum.
 * @author Sean A. Irvine
 */
public class A282079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282079() {
    super(new long[] {1, -3, 5, -7, 7, -5, 3}, new long[] {1, 1, 2, 6, 9, 9, 12});
  }
}
