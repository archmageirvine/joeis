package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094865 Expansion of <code>x^3/((1-3*x+x^2)*(1-5*x+5*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A094865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094865() {
    super(new long[] {-5, 20, -21, 8}, new long[] {0, 0, 0, 1});
  }
}
