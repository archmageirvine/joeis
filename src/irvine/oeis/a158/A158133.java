package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158133 a(n) = 144*n + 1.
 * @author Sean A. Irvine
 */
public class A158133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158133() {
    super(1, new long[] {-1, 2}, new long[] {145, 289});
  }
}
