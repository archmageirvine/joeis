package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084367 a(n) = n*(2*n+1)^2.
 * @author Sean A. Irvine
 */
public class A084367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084367() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 9, 50, 147});
  }
}
