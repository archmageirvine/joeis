package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347059 Decimal expansion of the Dirichlet eta function at 9.
 * @author Sean A. Irvine
 */
public class A347059 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347059() {
    super(0, Zeta.zeta(9).multiply(255).divide(CR.valueOf(256)));
  }
}
