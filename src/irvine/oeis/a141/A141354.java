package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141354 Expansion of (1-5*x-x^2+x^3)/((1+x)*(1-x)^3).
 * @author Sean A. Irvine
 */
public class A141354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141354() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, -3, -7, -15});
  }
}
