package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113405 Expansion of x^3/(1 - 2*x + x^3 - 2*x^4) = x^3/( (1-2*x)*(1+x)*(1-x+x^2) ).
 * @author Sean A. Irvine
 */
public class A113405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113405() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 0, 0, 1});
  }
}
