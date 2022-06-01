package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161715 a(n) = (50*n^7 - 1197*n^6 + 11333*n^5 - 53655*n^4 + 132125*n^3 - 156828*n^2 + 73212*n + 5040)/5040.
 * @author Sean A. Irvine
 */
public class A161715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161715() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 3, 5, 6, 10, 15, 30});
  }
}
