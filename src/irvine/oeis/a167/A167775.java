package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167775 Subsequence of <code>A167708</code> whose indices are congruent to <code>1 mod 5</code>, i.e., <code>a(n) = A167708(5n+1)</code>.
 * @author Sean A. Irvine
 */
public class A167775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167775() {
    super(new long[] {-1, 340}, new long[] {10, 2441});
  }
}
