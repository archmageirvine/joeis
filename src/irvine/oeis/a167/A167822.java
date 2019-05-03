package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167822 Subsequence of <code>A167709</code> whose indices are congruent to <code>1 mod 5</code>, i.e., <code>a(n) = A167709(5*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A167822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167822() {
    super(new long[] {-1, 340}, new long[] {1, 560});
  }
}
