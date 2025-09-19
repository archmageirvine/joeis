package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388613 Decimal expansion of (1/8) * 2^(1/4) * Gamma(5/8)^2 * (2+sqrt(2))^(3/2) / sqrt(Pi) / Gamma(7/8)^2.
 * @author Sean A. Irvine
 */
public class A388613 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388613() {
    super(0, CR.TWO.pow(Q.ONE_QUARTER).divide(8).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()));
  }
}
