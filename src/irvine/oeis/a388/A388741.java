package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388741 Decimal expansion of ((4756+3363 * sqrt(2))^(1/8) * Gamma(1/4)^2 * sin(Pi / 8)^2) / Pi^(3/2).
 * @author Sean A. Irvine
 */
public class A388741 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388741() {
    super(1, CR.TWO.pow(new Q(-29, 16)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).square()).multiply(CR.TWO.add(CR.SQRT2)).divide(CR.TWO.subtract(CR.SQRT2).pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).square()).divide(CR.SQRT_PI));
  }
}
