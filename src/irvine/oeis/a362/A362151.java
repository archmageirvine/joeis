package irvine.oeis.a362;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A362151 Decimal expansion of exp(zeta(2)/exp(gamma)) where gamma is the Euler-Mascheroni constant A001620.
 * @author Sean A. Irvine
 */
public class A362151 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A362151() {
    super(1, Zeta.zeta(2).divide(CR.GAMMA.exp()).exp());
  }
}
