package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214732 a(n) = 25*n^2 + 15*n + 1021.
 * @author Sean A. Irvine
 */
public class A214732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214732() {
    super(new long[] {1, -3, 3}, new long[] {1021, 1061, 1151});
  }
}
