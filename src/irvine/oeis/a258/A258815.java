package irvine.oeis.a258;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A258815 Decimal expansion of the Dirichlet beta function of 8.
 * @author Sean A. Irvine
 */
public class A258815 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A258815() {
    super(Zeta.zetaHurwitz(8, CR.valueOf(new Q(1, 4))).subtract(Zeta.zetaHurwitz(8, CR.valueOf(new Q(3, 4)))).divide(CR.valueOf(65536)));
  }
}
