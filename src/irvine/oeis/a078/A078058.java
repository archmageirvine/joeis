package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078058 Expansion of <code>(1-x)/(1+2*x-x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A078058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078058() {
    super(new long[] {-1, 1, -2}, new long[] {1, -3, 7});
  }
}
