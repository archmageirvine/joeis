package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167774 Subsequence of <code>A167708</code> whose indices are congruent to <code>1 mod 5</code>, i.e., <code>a(n) = A167708(5*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A167774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167774() {
    super(new long[] {-1, 340}, new long[] {9, 1530});
  }
}
