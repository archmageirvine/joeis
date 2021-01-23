package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113980 Number of compositions of n with an odd number of 1's.
 * @author Sean A. Irvine
 */
public class A113980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113980() {
    super(new long[] {-4, 2, 2}, new long[] {1, 0, 3});
  }
}
