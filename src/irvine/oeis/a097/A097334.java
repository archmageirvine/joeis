package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097334 Sum <code>k=0..n, C(n-k, floor(k/2))2^k</code>.
 * @author Sean A. Irvine
 */
public class A097334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097334() {
    super(new long[] {4, 0, 1}, new long[] {1, 3, 3});
  }
}
