package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347150 Decimal expansion of the Dirichlet eta function at 8.
 * @author Sean A. Irvine
 */
public class A347150 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347150() {
    super(Zeta.zeta(8).multiply(127).divide(CR.valueOf(128)));
  }
}
