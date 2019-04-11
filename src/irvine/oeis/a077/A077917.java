package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077917 Expansion of <code>(1-x)^(-1)/(1+2*x-2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A077917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077917() {
    super(new long[] {-2, 4, -1}, new long[] {1, -1, 5});
  }
}
