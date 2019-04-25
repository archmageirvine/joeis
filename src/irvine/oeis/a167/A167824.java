package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167824 Subsequence of A167709 whose indices are congruent to <code>3 mod 5, i</code>.e., <code>a(n) =</code> A167709(5*n+3).
 * @author Sean A. Irvine
 */
public class A167824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167824() {
    super(new long[] {-1, 340}, new long[] {24, 8175});
  }
}
