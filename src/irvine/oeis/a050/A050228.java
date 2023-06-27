package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050228 a(n) is the number of subsequences {s(k)} of {1,2,3,...n} such that s(k+1)-s(k) is 1 or 3.
 * @author Sean A. Irvine
 */
public class A050228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050228() {
    super(1, new long[] {1, -2, 2, -3, 3}, new long[] {1, 3, 6, 11, 19});
  }
}
