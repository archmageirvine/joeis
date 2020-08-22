package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094622 Expansion of x*(11+20*x)/((1-x)*(1-10*x^2)).
 * @author Sean A. Irvine
 */
public class A094622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094622() {
    super(new long[] {-10, 10, 1}, new long[] {0, 11, 31});
  }
}
