package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388083 Decimal expansion of Pi^6 / Gamma(3/4)^24.
 * @author Sean A. Irvine
 */
public class A388083 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388083() {
    super(1, CR.PI.pow(6).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(24)));
  }
}
