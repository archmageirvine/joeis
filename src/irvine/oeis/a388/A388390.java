package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388390 Decimal expansion of (1/64) * exp(Pi) * Pi^(5/2) / Gamma(3/4)^10.
 * @author Sean A. Irvine
 */
public class A388390 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388390() {
    super(0, CR.PI.exp().divide(64).multiply(CR.PI.pow(new Q(5, 2))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
