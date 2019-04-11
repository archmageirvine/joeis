package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159617 G.f.: <code>(1-x)/(1-8*x-8*x^2+8*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A159617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159617() {
    super(new long[] {-8, 8, 8}, new long[] {1, 7, 64});
  }
}
