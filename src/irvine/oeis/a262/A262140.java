package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262140 The first of nine consecutive positive integers the sum of the squares of which is equal to the sum of the squares of eight consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262140() {
    super(1, new long[] {1, -7, 7}, new long[] {20, 136, 812});
  }
}
