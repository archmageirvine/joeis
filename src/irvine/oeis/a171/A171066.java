package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171066 G.f. -x*(x-1)*(1+x)/(1-x-9*x^2-x^3+x^4).
 * @author Sean A. Irvine
 */
public class A171066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171066() {
    super(new long[] {-1, 1, 9, 1}, new long[] {0, 1, 1, 9});
  }
}
