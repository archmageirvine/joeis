package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054486 Expansion of <code>(1+2x)/(1-3x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A054486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054486() {
    super(new long[] {-1, 3}, new long[] {1, 5});
  }
}
