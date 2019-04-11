package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054489 Expansion of <code>(1+4x)/(1-6x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A054489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054489() {
    super(new long[] {-1, 6}, new long[] {1, 10});
  }
}
