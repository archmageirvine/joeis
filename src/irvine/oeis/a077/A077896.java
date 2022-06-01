package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077896 Expansion of (1-x)^(-1)/(1+x-2*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077896() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 0, 3, 0});
  }
}
