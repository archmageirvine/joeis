package irvine.oeis.a276;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A276120 Decimal expansion of zeta(3)/Pi^3.
 * @author Sean A. Irvine
 */
public class A276120 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A276120() {
    super(Zeta.zeta(3).divide(CR.PI.multiply(CR.PI).multiply(CR.PI)));
  }
}
