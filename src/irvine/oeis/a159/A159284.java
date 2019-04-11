package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159284 Expansion of <code>x*(1+x)/(1-x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A159284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159284() {
    super(new long[] {2, 1, 0}, new long[] {0, 1, 1});
  }
}
