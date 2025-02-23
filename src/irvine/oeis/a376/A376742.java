package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A376742 Decimal expansion of Product_{p prime} (p^3 + 1)/(p^3 - 1).
 * Formula:
 * @author Georg Fischer
 */
public class A376742 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A376742() {
    super(1, CR.valueOf(945).multiply(Zeta.zeta(3).square()).divide(CR.PI.pow(6)));
  }
}
