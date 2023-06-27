package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206927 Minimal numbers of binary length n+1 such that the number of contiguous palindromic bit patterns in the binary representation is minimal.
 * @author Sean A. Irvine
 */
public class A206927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206927() {
    super(1, new long[] {-2, 1, 0, 0, 0, 0, 2}, new long[] {2, 4, 9, 18, 37, 75, 150});
  }
}
