package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077242 Combined Diophantine Chebyshev sequences <code>A077240</code> and <code>A077239</code>.
 * @author Sean A. Irvine
 */
public class A077242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077242() {
    super(new long[] {-1, 0, 6, 0}, new long[] {5, 7, 23, 37});
  }
}
