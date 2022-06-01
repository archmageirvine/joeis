package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074475 a(n) = Sum_{j=0..floor(n/2)} T(2*j + q), where T(n) are generalized tribonacci numbers (A001644) and q = n - 2*floor(n/2).
 * @author Sean A. Irvine
 */
public class A074475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074475() {
    super(new long[] {1, 2, 2, 0}, new long[] {3, 1, 6, 8});
  }
}
