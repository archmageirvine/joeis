package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167822 Subsequence of A167709 whose indices are congruent to 1 mod 5, i.e., a(n) = A167709(5*n+1).
 * @author Sean A. Irvine
 */
public class A167822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167822() {
    super(new long[] {-1, 340}, new long[] {1, 560});
  }
}
