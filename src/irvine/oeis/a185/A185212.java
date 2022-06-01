package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185212 a(n) = 12*n^2 - 8*n + 1.
 * @author Sean A. Irvine
 */
public class A185212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185212() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 33});
  }
}
