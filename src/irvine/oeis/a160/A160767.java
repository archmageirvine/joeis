package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160767 Expansion of (1+12*x+28*x^2+12*x^3+x^4)/(1-x)^5.
 * @author Sean A. Irvine
 */
public class A160767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160767() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 17, 103, 367, 971});
  }
}
