package irvine.oeis.a068;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A068151 Continued fraction for Gamma(5/4).
 * @author Sean A. Irvine
 */
public class A068151 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A068151() {
    super(0, new A068467());
  }
}
