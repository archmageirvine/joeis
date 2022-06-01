package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077930 Expansion of (1-x)^(-1)/(1+2*x+x^2+x^3).
 * @author Sean A. Irvine
 */
public class A077930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077930() {
    super(new long[] {1, 0, 1, -1}, new long[] {1, -1, 2, -3});
  }
}
