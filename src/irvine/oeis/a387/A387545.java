package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387545 Decimal expansion of 2^(3/8) * Gamma(3/4) / (Pi^(1/4) * exp(Pi/24)).
 * @author Sean A. Irvine
 */
public class A387545 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387545() {
    super(1, CrFunctions.GAMMA.cr(new Q(3, 4)).multiply(CR.TWO.pow(new Q(3, 8)).divide(CR.PI.sqrt().sqrt().multiply(CR.PI.divide(24).exp()))));
  }
}

