package irvine.oeis.a267;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A267316 Decimal expansion of the Dirichlet eta function at 5.
 * @author Sean A. Irvine
 */
public class A267316 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A267316() {
    super(Zeta.zeta(5).multiply(15).divide(CR.valueOf(16)));
  }
}
