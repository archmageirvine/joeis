package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A063471 Continued fraction for sqrt(2) / zeta(2).
 * @author Sean A. Irvine
 */
public class A063471 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A063471() {
    super(new DecimalExpansionSequence(CR.SQRT2.divide(Zeta.zeta(2))));
  }
}
