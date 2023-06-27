package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085786 a(n) = n*(2*n^2 + n + 1)/2.
 * @author Sean A. Irvine
 */
public class A085786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085786() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {2, 11, 33, 74});
  }
}
