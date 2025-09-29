package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388582 Decimal expansion of ((-1+sqrt(3)) * exp(Pi / 3)) / 2.
 * @author Sean A. Irvine
 */
public class A388582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388582() {
    super(1, CR.PI.divide(3).exp().multiply(new Q(3, 16)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()));
  }
}
