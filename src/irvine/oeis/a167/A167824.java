package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167824 Subsequence of A167709 whose indices are congruent to 3 mod 5, i.e., a(n) = A167709(5*n+3).
 * @author Sean A. Irvine
 */
public class A167824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167824() {
    super(new long[] {-1, 340}, new long[] {24, 8175});
  }
}
