package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389828 Decimal expansion of 15/8 + Pi/4 * coth(Pi) - zeta(2) - zeta(6).
 * @author Sean A. Irvine
 */
public class A389828 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389828() {
    super(0, CR.PI.coth().multiply(CR.PI).divide(4).add(new Q(15, 8)).subtract(Zeta.zeta(2)).subtract(Zeta.zeta(6)));
  }
}
