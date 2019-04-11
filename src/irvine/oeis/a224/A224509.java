package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224509 Expansion of <code>(1-x)*(1-2*x)*(1-3*x)/(1-9*x+28*x^2-35*x^3+15*x^4-x^5)</code>.
 * @author Sean A. Irvine
 */
public class A224509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224509() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 3, 10, 35, 125});
  }
}
