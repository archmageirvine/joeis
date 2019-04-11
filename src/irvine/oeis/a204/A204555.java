package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204555 The number of subsets of the numbers <code>{1,2,3</code>...,n} consisting of at most 3 elements and at most two of those are even.
 * @author Sean A. Irvine
 */
public class A204555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204555() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 4, 8, 15, 26, 41});
  }
}
