package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108476 Expansion of <code>(1-4x)/(1-6x-12x^2+8x^3)</code>.
 * @author Sean A. Irvine
 */
public class A108476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108476() {
    super(new long[] {-8, 12, 6}, new long[] {1, 2, 24});
  }
}
