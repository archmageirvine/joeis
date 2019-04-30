package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109243 <code>2^(n-1)J(n,1/2)</code> where <code>J(n</code>,x)=n-th Jacobsthal polynomial.
 * @author Sean A. Irvine
 */
public class A109243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109243() {
    super(new long[] {-64, 0, 96, 0, -52, 0, 12, 0}, new long[] {0, 1, 2, 6, 32, 28, 248, 120});
  }
}
