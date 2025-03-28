package irvine.oeis.a329;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A329090 Decimal expansion of Sum_{k&gt;=1} 1/(k^2+2).
 * Formula:
 * @author Georg Fischer
 */
public class A329090 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A329090() {
    super(0, CR.ZERO.subtract(CR.ONE).add(CR.SQRT2.multiply(CR.PI).multiply(CR.SQRT2.multiply(CR.PI).coth())).divide(CR.FOUR));
  }
}
