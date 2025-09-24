package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388959 Decimal expansion of (1/200) * exp(Pi) * Pi * (5-5^(1/2)) * 5^(1/2) / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388959 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388959() {
    super(0, CR.PI.exp().divide(200).multiply(CR.PI).multiply(CR.FIVE.subtract(CR.FIVE.sqrt())).multiply(CR.FIVE.sqrt()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
