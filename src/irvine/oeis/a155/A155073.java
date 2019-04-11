package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155073 G.f.: <code>(1+6*x)/(1-12*x-8*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A155073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155073() {
    super(new long[] {8, 12}, new long[] {1, 18});
  }
}
