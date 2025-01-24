package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108476 Expansion of (1-4*x)/(1-6*x-12*x^2+8*x^3).
 * @author Sean A. Irvine
 */
public class A108476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108476() {
    super(new long[] {-8, 12, 6}, new long[] {1, 2, 24});
  }
}
