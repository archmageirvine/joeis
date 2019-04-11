package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078043 Expansion of <code>(1 - x)/(1 + x - x^2 + 2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A078043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078043() {
    super(new long[] {-2, 1, -1}, new long[] {1, -2, 3});
  }
}
