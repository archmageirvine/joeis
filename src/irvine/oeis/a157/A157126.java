package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157126 Expansion of (1-2x-3x^2+x^3-x^5)/(1+4x^3+x^6).
 * @author Sean A. Irvine
 */
public class A157126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157126() {
    super(new long[] {-1, 0, 0, -4, 0, 0}, new long[] {1, -2, -3, -3, 8, 11});
  }
}
