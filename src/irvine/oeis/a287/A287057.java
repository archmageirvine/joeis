package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287057 a(n) = 2*n^2 + n - (n+1) mod 2.
 * @author Sean A. Irvine
 */
public class A287057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287057() {
    super(new long[] {1, -2, 0, 2}, new long[] {3, 9, 21, 35});
  }
}
