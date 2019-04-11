package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271893 Expansion of <code>(2*x+1)*(1-x) / ( 1-2*x-4*x^2+6*x^3 )</code>.
 * @author Sean A. Irvine
 */
public class A271893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271893() {
    super(new long[] {-6, 4, 2}, new long[] {1, 3, 8});
  }
}
