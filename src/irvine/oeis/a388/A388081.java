package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388081 Decimal expansion of Pi^3 / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388081 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388081() {
    super(1, CR.PI.pow(3).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
