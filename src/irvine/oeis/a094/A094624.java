package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094624 Expansion of <code>x*(1+11*x+x^2)/((1-x)*(1+x)*(1-10*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A094624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094624() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 1, 11, 12});
  }
}
