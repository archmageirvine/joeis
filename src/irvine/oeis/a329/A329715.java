package irvine.oeis.a329;
// Generated by gen_seq4.pl 2023-11-25/decexp at 2023-11-25 22:37

import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A329715 Decimal expansion of Sum_{k&gt;=1} Kronecker(8,k)/k^3.
 * Formula: , where zeta(s,a) is the Hurwitz zeta function.
 * @author Georg Fischer
 */
public class A329715 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A329715() {
    super(0, Zeta.zetaHurwitz(3, new Q(1, 8)).subtract(Zeta.zetaHurwitz(3, new Q(3, 8))).subtract(Zeta.zetaHurwitz(3, new Q(5, 8))).add(Zeta.zetaHurwitz(3, new Q(7, 8))).divide(512));
  }
}
