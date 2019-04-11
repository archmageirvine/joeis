package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097335 Sum <code>k=0..n,</code> C(n-k, <code>floor(k/2))3^k</code>.
 * @author Sean A. Irvine
 */
public class A097335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097335() {
    super(new long[] {9, 0, 1}, new long[] {1, 4, 4});
  }
}
