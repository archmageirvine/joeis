package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A070860 Decimal expansion of Pi^2/12 - gamma^2 /2.
 * @author Sean A. Irvine
 */
public class A070860 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A070860() {
    super(0, CR.GAMMA.multiply(CR.GAMMA).subtract(Zeta.zeta(2)).divide(CR.TWO).negate());
  }
}

