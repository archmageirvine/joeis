package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077978 Expansion of 1/(1+x+2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A077978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077978() {
    super(new long[] {1, -2, -1}, new long[] {1, -1, -1});
  }
}
