package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167823 Subsequence of A167709 whose indices are congruent to <code>2 mod 5, i</code>.e., <code>a(n) =</code> A167709(5*n+2).
 * @author Sean A. Irvine
 */
public class A167823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167823() {
    super(new long[] {-1, 340}, new long[] {15, 5124});
  }
}
