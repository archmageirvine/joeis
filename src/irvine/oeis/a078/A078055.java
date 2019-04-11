package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078055 Expansion of <code>(1-x)/(1+2*x-2*x^2+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A078055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078055() {
    super(new long[] {-2, 2, -2}, new long[] {1, -3, 8});
  }
}
