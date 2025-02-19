package irvine.oeis.a245;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A245719 Decimal expansion of the skewness of the Gumbel distribution.
 * Formula:
 * @author Georg Fischer
 */
public class A245719 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A245719() {
    super(1, CR.valueOf(12).multiply(CR.SIX.sqrt()).multiply(Zeta.zeta(3)).divide(CR.PI.pow(3)));
  }
}
