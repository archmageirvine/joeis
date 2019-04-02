package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158778 G.f.: (1+3*x+12*x^2+48*x^3)/(1-x-256*x^4).
 * @author Sean A. Irvine
 */
public class A158778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158778() {
    super(new long[] {256, 0, 0, 1}, new long[] {1, 4, 16, 64});
  }
}
