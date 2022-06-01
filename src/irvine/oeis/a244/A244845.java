package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244845 Binary representation of 4^n - 2^(n+1) - 1.
 * @author Sean A. Irvine
 */
public class A244845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244845() {
    super(new long[] {1000, -1110, 111}, new long[] {111, 101111, 11011111});
  }
}
