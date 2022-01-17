package irvine.oeis.a275;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A275710 Decimal expansion of the Dirichlet eta function at 7.
 * @author Sean A. Irvine
 */
public class A275710 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A275710() {
    super(Zeta.zeta(7).multiply(63).divide(CR.valueOf(64)));
  }
}
