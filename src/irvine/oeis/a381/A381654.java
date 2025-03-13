package irvine.oeis.a381;

import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381654 Decimal expansion of the multiple zeta value (Euler sum) zetamult(2,3,1) = zetamult(3,1,2).
 * @author Sean A. Irvine
 */
public class A381654 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381654() {
    super(0, Zeta.zeta(6).multiply(new Q(53, 24)).subtract(Zeta.zeta(3).square().multiply(new Q(3, 2))));
  }
}
