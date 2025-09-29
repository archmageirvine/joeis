package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388242 Decimal expansion of (2 / Pi)^(1/4) * Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388242 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388242() {
    super(1, CR.PI.pow(Q.ONE_QUARTER).inverse().multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
