package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063920 Numbers n such that n = 2*phi(n) + phi(phi(n)).
 * @author Sean A. Irvine
 */
public class A063920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063920() {
    super(new long[] {2, 0}, new long[] {10, 14});
  }
}
