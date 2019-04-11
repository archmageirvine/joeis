package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157128 Expansion of <code>(1-x-x^2+x^3-x^5)/(1+2x^3+x^6)</code>.
 * @author Sean A. Irvine
 */
public class A157128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157128() {
    super(new long[] {-1, 0, 0, -2, 0, 0}, new long[] {1, -1, -1, -1, 2, 1});
  }
}
