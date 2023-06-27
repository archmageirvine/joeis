package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125128 a(n) = 2^(n+1) - n - 2, or partial sums of main diagonal of array A125127 of k-step Lucas numbers.
 * @author Sean A. Irvine
 */
public class A125128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125128() {
    super(1, new long[] {2, -5, 4}, new long[] {1, 4, 11});
  }
}
