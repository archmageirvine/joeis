package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130902 a(n) is the number of binary strings of length n such that there exist 4 or more ones in a subsequence of length 5 or less.
 * @author Sean A. Irvine
 */
public class A130902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130902() {
    super(new long[] {2, -1, 0, 2, -1, -4, 0, 1, -2, -1, 3}, new long[] {0, 0, 0, 1, 6, 16, 39, 91, 207, 463, 1014});
  }
}
