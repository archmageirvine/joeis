package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077242 Combined Diophantine Chebyshev sequences A077240 and A077239.
 * @author Sean A. Irvine
 */
public class A077242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077242() {
    super(new long[] {-1, 0, 6, 0}, new long[] {5, 7, 23, 37});
  }
}
