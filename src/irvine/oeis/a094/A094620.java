package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094620 Expansion of x*(11 + 22*x + 20*x^2)/((1-x)*(1+x)*(1 - 10*x^2)).
 * @author Sean A. Irvine
 */
public class A094620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094620() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 11, 22, 141});
  }
}
