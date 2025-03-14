package irvine.oeis.a373;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A373702 Decimal expansion of (2 - zeta(2))*zeta(2)*zeta(3)/zeta(6).
 * Formula:
 * @author Georg Fischer
 */
public class A373702 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A373702() {
    super(0, CR.TWO.subtract(Zeta.zeta(2)).multiply(Zeta.zeta(2)).multiply(Zeta.zeta(3)).divide(Zeta.zeta(6)));
  }
}
