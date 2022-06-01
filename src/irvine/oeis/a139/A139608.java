package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139608 a(n) = 28*n + 8.
 * @author Sean A. Irvine
 */
public class A139608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139608() {
    super(new long[] {-1, 2}, new long[] {8, 36});
  }
}
