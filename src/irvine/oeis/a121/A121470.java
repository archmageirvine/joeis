package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121470 Expansion of x*(1+5*x+2*x^2+x^3)/((1+x)*(1-x)^3).
 * @author Sean A. Irvine
 */
public class A121470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121470() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {1, 7, 16, 31});
  }
}
