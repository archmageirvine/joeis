package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078066 Expansion of (1-x)/(1+2*x+x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A078066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078066() {
    super(new long[] {-2, -1, -2}, new long[] {1, -3, 5});
  }
}
