package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139272 a(n) = n*(8*n-5).
 * @author Sean A. Irvine
 */
public class A139272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139272() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 22});
  }
}
