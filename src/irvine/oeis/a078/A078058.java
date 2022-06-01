package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078058 Expansion of (1-x)/(1+2*x-x^2+x^3).
 * @author Sean A. Irvine
 */
public class A078058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078058() {
    super(new long[] {-1, 1, -2}, new long[] {1, -3, 7});
  }
}
