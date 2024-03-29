package irvine.oeis.a247;
// Generated by gen_seq4.pl 2023-11-25/decexp at 2023-11-25 22:37

import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A247037 Decimal expansion of Sum_{k &gt;= 0} 1/(4*k+3)^2.
 * Formula: = Psi(1, 3/4)/16, with the Hurwitz zeta function and the Trigamma function Psi(1, z), and the partial sums of the series g in the name are {A173955(n+2) / A173954(n+2)}_{n>=0}. - _Wolfdieter Lang_, Nov 14 2017
 * @author Georg Fischer
 */
public class A247037 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A247037() {
    super(0, Zeta.zetaHurwitz(2, new Q(3, 4)).divide(16));
  }
}
