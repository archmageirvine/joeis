package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167824 Subsequence of <code>A167709</code> whose indices are congruent to <code>3 mod 5</code>, i.e., <code>a(n) = A167709(5*n+3)</code>.
 * @author Sean A. Irvine
 */
public class A167824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167824() {
    super(new long[] {-1, 340}, new long[] {24, 8175});
  }
}
