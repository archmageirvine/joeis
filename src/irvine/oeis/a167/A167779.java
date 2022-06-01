package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167779 Subsequence of A167708 whose indices are congruent to 4 mod 5, i.e., a(n) = A167708(5n+4).
 * @author Sean A. Irvine
 */
public class A167779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167779() {
    super(new long[] {-1, 340}, new long[] {105, 35634});
  }
}
