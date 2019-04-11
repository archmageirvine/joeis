package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176812 Expansion of <code>3*(1+x)/(1-2*x-5*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A176812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176812() {
    super(new long[] {5, 2}, new long[] {3, 9});
  }
}
