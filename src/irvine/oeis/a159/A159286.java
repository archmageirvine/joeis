package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159286 Expansion of (x-1)^2/(1-x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A159286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159286() {
    super(new long[] {2, 1, 0}, new long[] {1, -2, 2});
  }
}
