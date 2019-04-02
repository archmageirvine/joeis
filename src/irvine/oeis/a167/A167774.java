package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167774 Subsequence of A167708 whose indices are congruent to 1 mod 5, i.e., a(n) = A167708(5*n+1).
 * @author Sean A. Irvine
 */
public class A167774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167774() {
    super(new long[] {-1, 340}, new long[] {9, 1530});
  }
}
