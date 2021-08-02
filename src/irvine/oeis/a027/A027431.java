package irvine.oeis.a027;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a276.A276120;

/**
 * A027431 Continued fraction for Pi^3/zeta(3).
 * @author Sean A. Irvine
 */
public class A027431 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A027431() {
    super(new DecimalExpansionSequence(new A276120().getCR().inverse()));
  }
}
