package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258440 Number of squares of all sizes in 3*n*(n+1)/2-ominoes in form of three-quarters of Aztec diamonds.
 * @author Sean A. Irvine
 */
public class A258440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258440() {
    super(1, new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {3, 11, 25, 49, 84, 132, 196});
  }
}
