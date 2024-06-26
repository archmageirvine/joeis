package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A341901 Decimal expansion of 1/zeta(9).
 * Formula:
 * @author Georg Fischer
 */
public class A341901 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A341901() {
    super(0, Zeta.zeta(9).inverse());
  }
}
