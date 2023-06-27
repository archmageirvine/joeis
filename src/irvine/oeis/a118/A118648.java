package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118648 a(n) is the number of binary strings of length n+3 such that there exists a subsequence of length 4 with 2 ones in it.
 * @author Sean A. Irvine
 */
public class A118648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118648() {
    super(4, new long[] {-2, 1, 0, -2, 3}, new long[] {11, 25, 54, 114, 237});
  }
}
