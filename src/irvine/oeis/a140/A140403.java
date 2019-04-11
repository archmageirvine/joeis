package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140403 Expansion of <code>8*x^4/((1-x)^2*(1-x^3)) + 8*x^5/((1-x)*(1-x^2)*(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A140403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140403() {
    super(new long[] {1, 0, -1, -1, 0, 0, 0, 1, 1, 0}, new long[] {0, 0, 0, 0, 8, 24, 32, 56, 72, 96});
  }
}
