
package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074962 Decimal expansion of Glaisher-Kinkelin constant A.
 * @author Sean A. Irvine
 */
public class A074962 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074962() {
    super(1, CR.valueOf(new Q(1, 12)).subtract(new A006752().getCR().multiply(2).divide(CR.PI.multiply(9))).exp().divide(CrFunctions.BARNES_G.cr(Q.ONE_QUARTER).pow(new Q(8, 9)).multiply(CrFunctions.GAMMA.cr(Q.ONE_QUARTER).pow(new Q(2, 3)))));
  }
}

