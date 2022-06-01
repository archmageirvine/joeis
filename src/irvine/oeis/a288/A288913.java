package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288913 a(n) = Lucas(4*n + 3).
 * @author Sean A. Irvine
 */
public class A288913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288913() {
    super(new long[] {-1, 7}, new long[] {4, 29});
  }
}
