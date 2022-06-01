package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261934 The first of ten consecutive positive integers the sum of the squares of which is equal to the sum of the squares of two consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A261934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261934() {
    super(new long[] {1, -1, 0, 0, -18, 18, 0, 0, 1}, new long[] {7, 17, 26, 52, 205, 383, 544, 1010, 3755});
  }
}
