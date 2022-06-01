package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139271 a(n) = 2*n*(4*n-3).
 * @author Sean A. Irvine
 */
public class A139271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139271() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 20});
  }
}
