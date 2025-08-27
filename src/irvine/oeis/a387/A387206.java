package irvine.oeis.a387;

import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387206 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A387206 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387206() {
    super(1, Zeta.zetaHurwitz(6, Q.ONE_QUARTER).subtract(Zeta.zetaHurwitz(6, new Q(3, 4))).multiply(new Q(365, 1492992)));
  }
}

