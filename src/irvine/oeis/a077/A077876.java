package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077876 Expansion of (1-x)^(-1)/(1-x+2*x^2).
 * @author Sean A. Irvine
 */
public class A077876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077876() {
    super(new long[] {2, -3, 2}, new long[] {1, 2, 1});
  }
}
