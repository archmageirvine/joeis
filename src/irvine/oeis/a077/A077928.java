package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077928 Expansion of (1-x)^(-1)/(1+2*x+x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077928() {
    super(new long[] {-2, 3, 1, -1}, new long[] {1, -1, 2, 0});
  }
}
