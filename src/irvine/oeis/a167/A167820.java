package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167820 Subsequence of A167709 whose indices are congruent to 0 mod 5, i.e., a(n) = A167709(5*n).
 * @author Sean A. Irvine
 */
public class A167820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167820() {
    super(new long[] {-1, 340}, new long[] {0, 351});
  }
}
