package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259749 Numbers that are congruent to {1,2,5,7,10,11,13,17,19,23} mod 24.
 * @author Sean A. Irvine
 */
public class A259749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259749() {
    super(new long[] {-1, 2, -2, 2, -2, 2, -2, 2, -2, 2}, new long[] {1, 2, 5, 7, 10, 11, 13, 17, 19, 23});
  }
}
