package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102214 Expansion of (1 + 4*x + 4*x^2)/((1+x)*(1-x)^3).
 * @author Sean A. Irvine
 */
public class A102214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102214() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 6, 16, 30});
  }
}
