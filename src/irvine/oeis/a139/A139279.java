package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139279 a(n) = 40*n - 32.
 * @author Sean A. Irvine
 */
public class A139279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139279() {
    super(new long[] {-1, 2}, new long[] {8, 48});
  }
}
