package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077921 Expansion of (1-x)^(-1)/(1+2*x-x^2).
 * @author Sean A. Irvine
 */
public class A077921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077921() {
    super(new long[] {-1, 3, -1}, new long[] {1, -1, 4});
  }
}
