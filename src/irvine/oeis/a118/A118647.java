package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118647 a(n) is the number of binary strings of length n such that no subsequence of length 4 contains 3 or more ones.
 * @author Sean A. Irvine
 */
public class A118647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118647() {
    super(new long[] {-1, 0, 1, 0, 1, 1}, new long[] {2, 4, 7, 11, 19, 33});
  }
}
