package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255630 Number of n-length ternary words avoiding runs of zeros of length 1 (mod 3).
 * @author Sean A. Irvine
 */
public class A255630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255630() {
    super(new long[] {3, 0, 2}, new long[] {1, 2, 5});
  }
}
