package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388873 Decimal expansion of (1/8) * 2^(15/16) * Gamma(5/8)^2 * (2+sqrt(2)) / (2-sqrt(2))^(1/4) / sqrt(Pi) / Gamma(7/8)^2.
 * @author Sean A. Irvine
 */
public class A388873 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388873() {
    super(0, CR.TWO.pow(new Q(15, 16)).divide(8).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).multiply(CR.TWO.add(CR.SQRT2)).divide(CR.TWO.subtract(CR.SQRT2).pow(Q.ONE_QUARTER)).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()));
  }
}
