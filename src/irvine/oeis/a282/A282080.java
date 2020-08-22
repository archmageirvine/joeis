package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282080 Number of n-element subsets of [n+4] having an even sum.
 * @author Sean A. Irvine
 */
public class A282080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282080() {
    super(new long[] {1, -5, 13, -25, 38, -46, 46, -38, 25, -13, 5}, new long[] {1, 2, 6, 19, 38, 60, 100, 170, 255, 350, 490});
  }
}
