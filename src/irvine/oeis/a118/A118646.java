package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118646 a(n) is the number of binary strings of length n such that there exists a subsequence of length 4 containing 3 or more ones.
 * @author Sean A. Irvine
 */
public class A118646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118646() {
    super(new long[] {2, -1, -2, 1, -2, -1, 3}, new long[] {0, 0, 1, 5, 13, 31, 71});
  }
}
