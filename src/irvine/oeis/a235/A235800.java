package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235800 Length of n-th vertical line segment from left to right in a diagram of a two-dimensional version of the Collatz (or 3x + 1) problem.
 * @author Sean A. Irvine
 */
public class A235800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235800() {
    super(new long[] {-1, 0, 2, 0}, new long[] {3, 1, 7, 2});
  }
}
