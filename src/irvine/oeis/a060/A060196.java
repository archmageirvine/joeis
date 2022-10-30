package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060196 Decimal expansion of 1 + 1/(1*3) + 1/(1*3*5) + 1/(1*3*5*7) + ...
 * @author Sean A. Irvine
 */
public class A060196 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A060196() {
    super(CR.E.multiply(CR.HALF_PI).sqrt().multiply(CR.SQRT2.inverse().erf()));
  }
}
