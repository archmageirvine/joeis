package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214659 a(n) = n*(7*n^2 - 3*n - 1)/3.
 * @author Sean A. Irvine
 */
public class A214659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214659() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 14, 53});
  }
}
