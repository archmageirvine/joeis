package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063920 Numbers k such that k = 2*phi(k) + phi(phi(k)).
 * @author Sean A. Irvine
 */
public class A063920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063920() {
    super(new long[] {2, 0}, new long[] {10, 14});
  }
}
