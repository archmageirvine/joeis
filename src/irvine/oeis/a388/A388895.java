package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388895 Decimal expansion of (Pi * exp(Pi / 12)) / (2^(3/4) * Gamma(3/4)^4).
 * @author Sean A. Irvine
 */
public class A388895 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388895() {
    super(1, CR.PI.divide(12).exp().divide(2).multiply(CR.PI).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
