package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282137 Expansion of (24x^2-10x-1)/(16x^3-16x^2+x-1).
 * @author Sean A. Irvine
 */
public class A282137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282137() {
    super(new long[] {16, -16, 1}, new long[] {1, 11, -29});
  }
}
