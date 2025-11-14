package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081855 Decimal expansion of Gamma''(1).
 * @author Sean A. Irvine
 */
public class A081855 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A081855() {
    super(1, CR.GAMMA.multiply(CR.GAMMA).add(Zeta.zeta(2)));
  }
}

