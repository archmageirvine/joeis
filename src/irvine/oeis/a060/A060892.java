package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060892 a(n) = n^8 - n^6 + n^4 - n^2 + 1.
 * @author Sean A. Irvine
 */
public class A060892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060892() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 1, 205, 5905, 61681, 375601, 1634221, 5649505, 16519105});
  }
}
