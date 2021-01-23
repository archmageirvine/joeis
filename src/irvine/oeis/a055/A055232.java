package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055232 Expansion of (1+2*x+3*x^2)/((1-x)^3*(1-x^2)).
 * @author Sean A. Irvine
 */
public class A055232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055232() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 5, 16, 36, 69});
  }
}
