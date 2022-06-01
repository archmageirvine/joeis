package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093917 a(n) = n^3+n for odd n, (n^3+n)*3/2 for even n: Row sums of A093915.
 * @author Sean A. Irvine
 */
public class A093917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093917() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {2, 15, 30, 102, 130, 333, 350, 780});
  }
}
