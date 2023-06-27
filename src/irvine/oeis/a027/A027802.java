package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027802 a(n) = 5*(n+1)*binomial(n+4,6).
 * @author Sean A. Irvine
 */
public class A027802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027802() {
    super(2, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {15, 140, 700, 2520, 7350, 18480, 41580, 85800});
  }
}
