package irvine.oeis.a294;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A294967 Decimal expansion of (1/9)*Hurwitz Zeta(2, 2/3) = (1/9)*Psi(1, 2/3), with the Polygamma function Psi.
 * @author Sean A. Irvine
 */
public class A294967 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A294967() {
    super(Zeta.zetaHurwitz(2, CR.valueOf(new Q(2, 3))).divide(CR.NINE));
  }
}
