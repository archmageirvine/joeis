package irvine.oeis.a200;
// Generated by gen_seq4.pl 2025-04-08.ack/psi_neg at 2025-04-08 00:02

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A200138 Decimal expansion of the negated value of the digamma function at 4/5.
 * Expansion of -psi(4/5).
 * @author Georg Fischer
 */
public class A200138 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A200138() {
    super(0, CrFunctions.DIGAMMA.cr(CR.valueOf(new Q(4, 5))).negate());
  }
}
