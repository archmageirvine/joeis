package irvine.oeis.a051;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A051149 Continued fraction for BesselK(1,2)/BesselK(0,2).
 * @author Sean A. Irvine
 */
public class A051149 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A051149() {
    super(new A051148());
  }
}
